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
			action="<%=path%>/b1011Action.action";
		}
	}
	</script>
	</head>
	<body>
	<s:property value="msg" />
		<s:form action="b1015Action">
			<TABLE border="1" align="center" width="850px">
				<caption>
					��ӿͻ�����
					<hr width="320">
				</caption>
				<TR>
					<TD>
						�ͻ��˺�
					</TD>
					<TD>
						<s:textfield name="lg2102" />
					</TD>
				</TR>
				<TR>
					<TD>
						�ͻ�����
					</TD>
					<TD>
						<s:textfield name="lg0102" />
					</TD>
				</TR>
				<TR>
					<TD>
						�ͻ����֤����
					</TD>
					<TD>
						<s:textfield name="lg0103" />
					</TD>
				</TR>
				<TR>
					<TD>
						�ͻ���ַ
					</TD>
					<TD>
						<s:textfield name="lg0104" />
					</TD>
				</TR>
				<TR>
					<TD>
						�ͻ��ֻ�����
					</TD>
					<TD>
						<s:textfield name="lg0105" />
					</TD>
				</TR>
				<TR>
					<TD>
						E-mail
					</TD>
					<TD>
						<s:textfield name="lg0106" />
					</TD>
				</TR>
				<!-- ��ť -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="ȷ�����" name="next" />
						<s:submit value="����" name="next2" onclick="return onNext2()" />
					</TD>
				</TR>
			</TABLE>
			<s:hidden name="qlg2102"/>
			<s:hidden name="qlg0102"/>
			<s:hidden name="qlg0103"/>
			<s:hidden name="qlg0105"/>
		</s:form>
	</body>
</html>
