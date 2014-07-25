<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
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
	font-family: verdana, arial, sans-serif;
	font-size: 11px;
	color: #333333;
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

.oddrowcolor {
	background-color: #d4e3e5;
}

.evenrowcolor {
	background-color: #c3dde0;
}
	</style>
	<script type="text/javascript" src="<%=path%>/js/calendar.js"></script>
	<script type="text/javascript">
	function onResetpwd(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/b1013Action.action?lg2101="+obj;
			submit();
		}
	}
	</script>
	</head>
	<body>
	<s:property value="msg" />
		<s:form action="b1011Action">
			<TABLE border="1" align="center" width="850px">
				<caption>
					客户信息管理界面
					<hr width="320">
				</caption>
				<TR>
					<TD>
						客户账号
					</TD>
					<TD>
						<s:textfield name="qlg2102" />
					</TD>
					<TD>
						客户姓名
					</TD>
					<TD>
						<s:textfield name="qlg0102" />
					</TD>
				</TR>
				<TR>
					<TD>
						客户身份证号码
					</TD>
					<TD>
						<s:textfield name="qlg0103" />
					</TD>
					<TD>
						客户手机号码
					</TD>
					<TD>
						<s:textfield name="qlg0105" />
					</TD>
				</TR>
				<!-- 迭代数据 -->
				<s:if test="rows!=null">
					<TR>
						<TD colspan="100">
							<table border="1" width="100%" class="altrowstable" id="alternatecolor">
								<tr>
									<td>
										序号
									</td>
									<td>
										客户账号
									</td>
									<td>
										客户姓名
									</td>
									<td>
										客户手机
									</td>
									<td>
										E-mail
									</td>
									<td>
										地址
									</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<s:iterator value="rows" status="st">
									<tr>
										<td>
											<s:property value="#st.count" />
										</td>
										<td>
											<s:property value="lg2102" />
										</td>
										<td>
											<s:property value="lg0102" />
										</td>
										<td>
											<s:property value="lg0105" />
										</td>
										<td>
											<s:property value="lg0106" />
										</td>
										<td>
											<s:property value="lg0104" />
										</td>
										<td>
											<a href="#" onclick="onLock(<s:property value="lg2101"/>)">锁定</a>
										</td>
										<td>
											<a href="#" onclick="onResetpwd(<s:property value="lg2101"/>)">重置密码</a>
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
						<TD colspan="100">
							<s:property value="msg" />
						</TD>
					</TR>
				</s:else>
				<!-- 按钮 -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="查询" name="next" />
						<s:submit value="添加" name="next2" onclick="return onNext2()" />
					</TD>
				</TR>
			</TABLE>
		</s:form>
	</body>
</html>
