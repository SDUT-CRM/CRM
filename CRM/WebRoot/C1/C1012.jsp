<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
	</head>
	<body>
		<s:property value="msg" />
		<s:form action="c1012Action">
			<TABLE border="1" align="center" width="850px">
				<caption>
					�༭Ա����Ϣ����
					<hr width="320">
				</caption>
				<TR>
				<TD>�˺�</TD>
				<TD><s:textfield name="lg2102" disabled="true"/></TD>
				<TD>����</TD>
				<TD><s:textfield name="lg2103"/></TD>
				</TR>
				<TR>
				<TD>����</TD>
				<TD><s:textfield name="lg2104"/></TD>
				<TD>���</TD>
				<TD><s:textfield name="cnlg2105"/></TD>
				</TR>
				<TR>
				<TD>����</TD>
				<TD><s:textfield name="lg0202"/></TD>
				<TD>���֤����</TD>
				<TD><s:textfield name="lg0202"/></TD>
				</TR>
				<TR>
				<TD>��ַ</TD>
				<TD><s:textfield name="lg0204"/></TD>
				<TD>�ֻ�����</TD>
				<TD><s:textfield name="lg0205"/></TD>
				</TR>
				<TR>
				<TD>E-Mail</TD>
				<TD><s:textfield name="lg0206"/></TD>
				<TD>����</TD>
				<TD><s:textfield name="cnlg0401"/></TD>
				</TR>
				<TR>
				<TD>״̬</TD>
				<TD><s:textfield name="cnlg0207"/></TD>
				<TD>��ְ����</TD>
				<TD><s:textfield name="lg0208"/></TD>
				</TR>
				<TR>
				<TD></TD>
				<TD></TD>
				<TD></TD>
				<TD></TD>
				</TR>
				<TR>
				<TD></TD>
				<TD></TD>
				<TD></TD>
				<TD></TD>
				</TR>
			</TABLE>

			<input type="hidden" name="edit" value="1" />
			<input type="hidden" name="lg0207" value="1" />
			<input type="hidden" name="lg2105" value="1" />
			<s:hidden name="qlg0401"/>
			<s:hidden name="qlg0207"/>
			<s:hidden name="qlg2102"/>
			<s:hidden name="qlg0202"/>
			<s:hidden name="blg0208"/>
			<s:hidden name="elg0208"/>
		</s:form>

	</body>
</html>
