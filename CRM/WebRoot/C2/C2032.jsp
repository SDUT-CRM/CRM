<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
	<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
		<script type="text/javascript">
		function onNext2()
		{
			with(document.forms[0])
			{
				action="<%=path%>/c2031Action.action";
			}
		}
	
</script>
	</head>
	<body>
		
		<s:form action="c2035Action">
			<s:property value="msg"/>
			<TABLE border="1" align="center" width="1000px">
				<caption>
					�����Ϣ���ҳ��
					<hr width="300px">
				</caption>
				<TR>
					<TD>
						������
					</TD>
					<TD>
						<s:textfield name="lg1302" />
					</TD>
				</TR>
				<TR>
					<TD>
						�������
					</TD>
					<TD>
						<s:textfield name="lg1303" />
					</TD>
				</TR>
				<TR>
					<TD>
						����۸�
					</TD>
					<TD>
						<s:textfield name="lg1304" />
					</TD>
				</TR>
				<TR>
					<TD>
						�������
					</TD>
					<TD>
						<s:textfield name="lg1305" />
					</TD>
				</TR>
				<TR>
					<TD colspan="100" align="center">
						<s:submit name="next" value="ȷ��" />
						<s:submit name="next" value="����" onclick="onNext2()"/>
					</TD>
				</TR>
			</TABLE>
			<s:hidden name="qlg1302"/>
			<s:hidden name="qlg1303"/>
		</s:form>
	</body>
</html>
