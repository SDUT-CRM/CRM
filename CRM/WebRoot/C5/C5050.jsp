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
	<script type="text/javascript" src="<%=path%>/js/calendar.js"></script>
		<script type="text/javascript">
		var count = 0;
	function onSelect(obj) {
		with (document.forms[0]) {
			obj ? ++count : --count;
			next[2].disabled = (count == 0);
			next[1].disabled = (count == 0);
		}
	}
		function onNext2(obj)
		{
			with(document.forms[0])
			{
				action="<%=path%>/c5052Action.action?type=" + obj;
		}
	}
</script>
	</head>
	<body>
		<s:form action="c5051Action">
			<TABLE border="1" align="center" width="1000px">
				<caption>
					������Ϣ�������
					<hr width="320">
				</caption>
				<TR>
					<TD>
						����������
					</TD>
					<TD colspan="101">
						<s:textfield name="lg0202" />
					</TD>
				</TR>
				<TR>
					<TD>
						��ʼʱ��
					</TD>
					<TD>
						<s:textfield name="blg1605" onclick="calendar.show(this);" />
					</TD>
					<TD>
						����ʱ��
					</TD>
					<TD>
						<s:textfield name="elg1605" onclick="calendar.show(this);"/>
					</TD>
				</TR>
				</TR>
				<!-- �������� -->
				<s:if test="rows!=null">
					<TR>
						<TD colspan="100">
							<table border="1" width="100%" class="altrowstable" id="alternatecolor">
								<tr>
									<td>
										&nbsp;
									</td>
									<td>
										���
									</td>
									<td>
										����������
									</td>
									<td>
										�������
									</td>
									<td>
										�������
									</td>
									<td>���״̬</td>
									<td>
										����ʱ��
									</td>
									<td>
										���ʱ��
									</td>
								</tr>
								<s:iterator value="rows" status="st">
									<tr>
										<td>
											<s:if test="lg1603==1">
												<input type="checkbox" name="parsList"
													onclick="onSelect(this.checked)"
													value="<s:property value="lg1601"/>">
											</s:if>
											<s:else>
									    &nbsp;&nbsp;
									    </s:else>
										</td>
										<td>
											<s:property value="#st.count" />
										</td>
										<td>
											<s:property value="lg0202" />
										</td>
										<td>
											<s:property value="cnlg1503" />
										</td>
										<td>
											<s:property value="lg1606" />
										</td>
										<td>
											<s:property value="cnlg1603"/>
										</td>
										<td>
											<s:property value="lg1602" />
										</td>
										<s:if test="lg1603!=1">
										<td>
											<s:property value="lg1604" />
										</td>
										</s:if>
										<s:else>
										<td>&nbsp;</td>
										</s:else>
										
								
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
				<!-- ��ť -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="��ѯ" name="next" />
						<s:submit value="ͨ��" name="next" onclick="return onNext2('2')"
							disabled="true" />
						<!--  <s:submit value="�ܾ�" name="next" onclick="return onNext2('3')"
							disabled="true" />-->
					</TD>
				</TR>
			</TABLE>
			<input type="hidden" name="parsList">
		</s:form>
	</body>
</html>
