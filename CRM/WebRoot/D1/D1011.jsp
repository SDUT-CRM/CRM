<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
%>
<html>
<head>
<title>this is my D1010.jsp</title>
<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
<script type="text/javascript">
	function onNext(){
		with(document.forms[0]) {
			action="<%=path%>/D1/d1011Action.action";
		}
	}
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="d1010Action">
	<table border="1" align="center" width="80%">
		<tr>
			<td>����</td>
			<td>
				<s:textfield name="name"/>
			</td>
		</tr>
		<tr>
			<td>���֤����</td>
			<td>
			<s:textfield name="idcard"/>
			</td>
		</tr>
		<tr>
			<td>סַ</td>
			<td>
			<s:textfield name="address"/>
			</td>
		</tr>
		<tr>
			<td>�ֻ�����</td>
			<td>
			<s:textfield name="phonenumber"/>
			</td>
		</tr>
		<tr>
			<td>email</td>
			<td>
			<s:textfield name="email"/>
			</td>
		</tr>
			<tr>
			<td colspan="100" align="center">
				<s:submit name="next" value="��Ӿ���" cssStyle="width:153px" onclick="return onNext()"/>
				<s:submit name="next" value="����" cssStyle="width:153px"/>
			</td>
		</tr>
	</table>
</s:form>
</body>
</html>
