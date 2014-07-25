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
	 业务详情
	 <hr width="160">
	 </caption>
	 <tr>
	 <td>业务编号</td>
	 <td>
	 <s:textfield name="lg0502" readonly="true" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>业务名称</td>
	 <td>
	 <s:textfield name="lg0503" readonly="true" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>业务详情</td>
	 <td>
	 <s:textfield name="lg0504" readonly="true" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>业务成本</td>
	 <td>
	 <s:textfield name="lg0505" readonly="true" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>业务价格</td>
	 <td>
	 <s:textfield name="lg0506" readonly="true" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>修改日期</td>
	 <td>
	 <s:textfield name="lg0508" readonly="true" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
	 <td>业务状态</td>
	 <td>
	 <s:textfield name="cnlg0509" readonly="true" cssStyle="width:300px"/>
	 </td>
	 </tr>
	 <tr>
		 <td colspan="100" align="center">
		 	<s:submit name="next" value="返回"/>
		 </td>
	 </tr>
	</table>
	<s:hidden name="lg0501"/>
</s:form>
</body>
</html>
