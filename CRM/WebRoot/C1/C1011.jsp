<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
	<script type="text/javascript">
	function onNext2()
	{
		with(document.forms[0])
		{
			action="<%=path%>/c1010Action.action";
		}
	}
	</script>
	</head>
	<body>
		<s:property value="msg" />
		<s:form action="c1012Action">
			<TABLE border="1" align="center" width="850px">
				<caption>
					���Ա������
					<hr width="320">
				</caption>
				<TR>
					<TD>
						�˺�
					</TD>
					<TD>
						<s:textfield name="lg2102" />
					</TD>
					<TD>
						����
					</TD>
					<TD>
						<s:password name="lg2103" />
					</TD>
				</TR>
				<TR>
					<TD>
						����
					</TD>
					<TD>
						<s:textfield name="lg2104" />
					</TD>
					<TD>
						E-Mail
					</TD>
					<TD>
						<s:textfield name="lg0206" />
					</TD>
				</TR>
				<TR>
					<TD>
						����
					</TD>
					<TD>
						<s:textfield name="lg0202" />
					</TD>
					<TD>
						���֤����
					</TD>
					<TD>
						<s:textfield name="lg0203" />
					</TD>
				</TR>
				<TR>
					<TD>
						��ַ
					</TD>
					<TD>
						<s:textfield name="lg0204" />
					</TD>
					<TD>
						�ֻ�����
					</TD>
					<TD>
						<s:textfield name="lg0205" />
					</TD>
				</TR>
				<TR>
					<TD>
						����
					</TD>
					<TD>
						<s:select name="lg0401" list="oclg0401" listKey="key"
							listValue="value" headerKey="" headerValue="==����=="
							cssStyle="width:153px" />
					</TD>
					<TD>
						��ְ����
					</TD>
					<TD>
						<s:textfield name="lg0208" />
					</TD>
				</TR>
				<TR>
					<TD colspan="100" align="center">
						<s:submit name="next" value="���" />
						<s:submit name="next2" value="����" onclick="return onNext2()"/>
					</TD>
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
