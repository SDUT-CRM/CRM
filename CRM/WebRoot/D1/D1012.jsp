<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<html>
<head>
<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
  <title>My JSP 'D1013.jsp' starting page</title>
  <script type="text/javascript">
  function onClick() 
  {
  	with(document.forms[0]) {
  		action="<%=path%>/d1015Action.action";
  		submit();
  	}
  }
  </script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="d1010Action">
	<table border="1" width="80%" align="center">
	 <caption>
	 人员修改
	 <hr width="160">
	 </caption>
	 <tr>
	 <td>姓名</td>
	 <td>
	 <s:textfield name="name" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>身份证号码</td>
	 <td>
	 <s:textfield name="idcard" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>地址</td>
	 <td>
	 <s:textfield name="address" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>电话号码</td>
	 <td>
	 <s:textfield name="phonenumber" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>email</td>
	 <td>
	 <s:textfield name="email" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 
	 <tr>
		 <td colspan="100" align="center">
		 	<s:submit name="next" value="修改" onclick="return onClick()"/>
		 	<s:submit name="next" value="返回"/>
		 </td>
	 </tr>
	</table>
	<s:hidden name="lg2104"/>
	<s:hidden name="lg2101"/>
	<s:hidden name="lg2105"/>
</s:form>
</body>
</html>
