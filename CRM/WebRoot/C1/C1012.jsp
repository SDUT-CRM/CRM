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
		<s:form action="c1014Action">
			<TABLE border="1" align="center" width="850px">
				<caption>
					�༭Ա����Ϣ����
					<hr width="320">
				</caption>
				<TR>
				<TD>�˺�</TD>
				<TD><s:textfield name="lg2102" disabled="true"/></TD>
				 <TD>��ְ����</TD>
				<TD><s:textfield name="lg0208" disabled="true"/></TD>
				<TR>
				</TR>
				<TR>
				<TD>����</TD>
				<TD><s:textfield name="lg2104"/></TD>
				<TD>���</TD>
				<TD>
				<s:select name="lg2105" list="oclg2105" listKey="key"
							listValue="value"
							cssStyle="width:153px" disabled="true"/>
				</TD>
				</TR>
				<TR>
				<TD>����</TD>
				<TD><s:textfield name="lg0202"/></TD>
				<TD>���֤����</TD>
				<TD><s:textfield name="lg0203"/></TD>
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
				<TD>
				<s:select name="lg0401" list="oclg0401" listKey="key"
							listValue="value"
							cssStyle="width:153px"/>
				</TD>
				</TR>
				<TR>
				<TD>״̬</TD>
				<TD>
				<s:select name="lg0207" list="oclg0207" listKey="key"
							listValue="value"
							cssStyle="width:153px"/>
				</TD>
				<TD colspan="100"></TD>
				</TR>
				<TR>
				<TD colspan="100" align="center">
				<s:submit name="next" value="����"/>
				<s:submit name="next2" value="����"/>
				</TD>
				</TR>
			</TABLE>

			<input type="hidden" name="lg2105" value="1" />
			<s:hidden name="lg2102"/>
			<s:hidden name="lg"/>
			<s:hidden name="lg2101"/>
			<s:hidden name="qlg0401"/>
			<s:hidden name="qlg0207"/>
			<s:hidden name="qlg2102"/>
			<s:hidden name="qlg0202"/>
			<s:hidden name="blg0208"/>
			<s:hidden name="elg0208"/>
			<s:debug/>
		</s:form>

	</body>
</html>
