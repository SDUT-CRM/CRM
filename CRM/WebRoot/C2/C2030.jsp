<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
	<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
	<!-- Javascript goes in the document HEAD -->
<script type="text/javascript">
function altRows(id){
	if(document.getElementsByTagName){  
		
		var table = document.getElementById(id);  
		var rows = table.getElementsByTagName("tr"); 
		 
		for(i = 0; i < rows.length; i++){          
			if(i % 2 == 0){
				rows[i].className = "evenrowcolor";
			}else{
				rows[i].className = "oddrowcolor";
			}      
		}
	}
}

window.onload=function(){
	altRows('alternatecolor');
}
</script>


<!-- CSS goes in the document HEAD or added to your external stylesheet -->
<style type="text/css">
table.altrowstable {
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #a9c6c9;
	border-collapse: collapse;
}
table.altrowstable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}
table.altrowstable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}
.oddrowcolor{
	background-color:#d4e3e5;
}
.evenrowcolor{
	background-color:#c3dde0;
}
</style>
		<script type="text/javascript">
	function onEdit(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/c2032Action.action?lg1301="+obj;
			submit();
		}
	}
	function onNext2()
	{
		with(document.forms[0])
		{
			action="<%=path%>/c2034Action.action";
		}
	}
</script>
	</head>
	<body>
		<s:property value="msg" />
		<s:form action="c2031Action">

			<TABLE border="1" align="center" width="1000px">
				<caption>
					配件信息管理页面
					<hr width="300px">
				</caption>
				<TR>
					<TD>
						配件编号
					</TD>
					<TD>
						<s:textfield name="qlg1302" />
					</TD>
				</TR>
				<TR>
					<TD>
						配件名称
					</TD>
					<TD>
						<s:textfield name="qlg1303" />
					</TD>
				</TR>
				<s:if test="rows!=null">
					<TR>
						<TD colspan="100">
							<table width="100%" border="1" class="altrowstable" id="alternatecolor">

								<tr>
									<td>
										序号
									</td>
									<td>
										配件编号
									</td>
									<td>
										配件名称
									</td>
									<td>
										配件价格
									</td>
									<td>
										配件数量
									</td>
									<td>
										&nbsp;
									</td>
								</tr>
								<s:iterator value="rows" status="st">
									<tr>
										<td>
											<s:property value="#st.count" />
										</td>
										<td>
											<s:property value="lg1302" />
										</td>
										<td>
											<s:property value="lg1303" />
										</td>
										<td>
											<s:property value="lg1304" />
										</td>
										<td>
											<s:property value="lg1305" />
										</td>
										<td>
											<a href="#" onclick="onEdit(<s:property value="lg1301" />)">修改</a>
										</td>
									</tr>
								</s:iterator>
							</table>
							${requestScope.pageinfo }
						</TD>
					</TR>
				</s:if>
				<s:else>
					<TR>
						<TD colspan="100" align="center">
							<s:property value="msg" />
						</TD>
					</TR>
				</s:else>
				<TR>
					<TD colspan="100" align="center">
						<s:submit name="next" value="查询" />
						<s:submit name="next" value="添加" onclick="return onNext2()" />
					</TD>
				</TR>
			</TABLE>
		</s:form>
	</body>
</html>
