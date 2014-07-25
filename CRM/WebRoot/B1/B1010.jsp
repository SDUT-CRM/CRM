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
					�ͻ���Ϣ�������
					<hr width="320">
				</caption>
				<TR>
					<TD>
						�ͻ��˺�
					</TD>
					<TD>
						<s:textfield name="qlg2102" />
					</TD>
					<TD>
						�ͻ�����
					</TD>
					<TD>
						<s:textfield name="qlg0102" />
					</TD>
				</TR>
				<TR>
					<TD>
						�ͻ����֤����
					</TD>
					<TD>
						<s:textfield name="qlg0103" />
					</TD>
					<TD>
						�ͻ��ֻ�����
					</TD>
					<TD>
						<s:textfield name="qlg0105" />
					</TD>
				</TR>
				<!-- �������� -->
				<s:if test="rows!=null">
					<TR>
						<TD colspan="100">
							<table border="1" width="100%" class="altrowstable" id="alternatecolor">
								<tr>
									<td>
										���
									</td>
									<td>
										�ͻ��˺�
									</td>
									<td>
										�ͻ�����
									</td>
									<td>
										�ͻ��ֻ�
									</td>
									<td>
										E-mail
									</td>
									<td>
										��ַ
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
											<a href="#" onclick="onLock(<s:property value="lg2101"/>)">����</a>
										</td>
										<td>
											<a href="#" onclick="onResetpwd(<s:property value="lg2101"/>)">��������</a>
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
				<!-- ��ť -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="��ѯ" name="next" />
						<s:submit value="���" name="next2" onclick="return onNext2()" />
					</TD>
				</TR>
			</TABLE>
		</s:form>
	</body>
</html>
