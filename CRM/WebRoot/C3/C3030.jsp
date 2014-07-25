<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
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
	function onEdit(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/c3040Action.action?lg0701="+obj;
			submit();
		}
	}
</script>
	</head>
	<body>
		<s:form action="c3031Action">
			<TABLE border="1" align="center" width="1000px">
				<caption>
					���Ϣ�������
					<hr width="320">
				</caption>
				<TR>
					<TD>
						�����
					</TD>
					<TD>
						<s:textfield name="qlg0702" />
					</TD>
					<TD>
						�����
					</TD>
					<TD>
						<s:textfield name="qlg0703" />
					</TD>
				</TR>
				<TR>
					<TD>
						������
					</TD>
					<TD>
						<s:textfield name="qlg0302" />
					</TD>
					<TD>
						�״̬
					</TD>
					<TD>
						<s:select name="qlg0707" list="oclg0707" listKey="key"
							listValue="value" headerKey="" headerValue="==����=="
							cssStyle="width:153px" />
					</TD>
				</TR>
				<TR>
					<TD>
						������ʼʱ��
					</TD>
					<TD>
						<s:textfield name="blg0706" onclick="calendar.show(this);" />
					</TD>
					<TD>
						������ֹʱ��
					</TD>
					<TD>
						<s:textfield name="elg0706" onclick="calendar.show(this);" />
					</TD>
				</TR>
				<TR>
					<TD>
						���ʼʱ��
					</TD>
					<TD>
						<s:textfield name="blg0708" onclick="calendar.show(this);" />
					</TD>
					<TD>
						���ֹʱ��
					</TD>
					<TD>
						<s:textfield name="elg0708" onclick="calendar.show(this);" />
					</TD>
				</TR>
				<!-- �������� -->
				<s:if test="rows!=null">
				<TR><TD colspan="100"><table border="1" width="100%" class="altrowstable" id="alternatecolor">
					<TR>
		

						<TD>
							���
						</TD>

						<TD>
							�����
						</TD>

						<TD>
							�����
						</TD>

						<TD>
							Ԥ��
						</TD>

						<TD>
							����
						</TD>

						<TD>
							������ֹʱ��
						</TD>

						<TD>
							���лʱ��
						</TD>

						<TD>
							������
						</TD>
						
						<TD>
							����
						</TD>

					</TR>
					<s:iterator value="rows" status="st">
						<TR>
					
							<TD>
								<s:property value="#st.count" />
							</TD>

							<TD>
								<s:property value="lg0702" />
							</TD>

							<TD>
								<s:property value="lg0703" />
							</TD>

							<TD>
								<s:property value="lg0704" />
							</TD>

							<TD>
								<s:property value="lg0705" />
							</TD>

							<TD>
								<s:property value="lg0706" />
							</TD>

							<TD>
								<s:property value="lg0708" />
							</TD>

							<TD>
								<s:property value="lg0302" />
							</TD>

							<TD>
								<a href="#" onclick="onEdit(<s:property value="lg0701"/>)">����</a>
							</TD>
							
						</TR>
					</s:iterator>
					</table>
					${requestScope.pageinfo }
					</TD></TR>
				</s:if>
				<!-- ��ť -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="��ѯ" name="next" />
					</TD>
				</TR>
			</TABLE>
			<input type="hidden" name="parsList">
		</s:form>
	</body>
</html>
