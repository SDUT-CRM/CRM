<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<html>
<head>
<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
  <title>My JSP 'D1013.jsp' starting page</title>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="d1010Action">
	<table border="1" width="80%" align="center">
	 <caption>
	 ��Ա����
	 <hr width="160">
	 </caption>
	 <tr>
	 <td>����</td>
	 <td>
	 <s:textfield name="name" readonly="true" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>���֤����</td>
	 <td>
	 <s:textfield name="idcard" readonly="true" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>��ַ</td>
	 <td>
	 <s:textfield name="address" readonly="true" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>�绰����</td>
	 <td>
	 <s:textfield name="phonenumber" readonly="true" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>email</td>
	 <td>
	 <s:textfield name="email" readonly="true" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>����</td>
	 <td>
	 <s:textfield name="dept" readonly="true" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
		 <td colspan="100" align="center">
		 	<s:submit name="next" value="����"/>
		 </td>
	 </tr>
	</table>
	<s:hidden name="lg2104"/>
	<s:hidden name="lg2101"/>
	<s:hidden name="lg2105"/>
</s:form>
</body>
</html>
