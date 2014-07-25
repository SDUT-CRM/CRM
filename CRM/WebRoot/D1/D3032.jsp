<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<html>
<head>
<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
  <title>My JSP 'D3032.jsp' starting page</title>
  <script type="text/javascript">
  function onUpdate() {
  	with(document.forms[0]) {
  		action="<%=path%>/d3034Action.action";
  		submit();
  	}
  }
  </script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="d3030Action">
<table>
<caption>
配件修改
<hr width="160">
</caption>
	<tr>
		<td>配件编号</td>
		<td>
		<s:textfield name="lg1302" readonly="true"/>
		</td>
	</tr>
	<tr>
		<td>配件名称</td>
		<td>
		<s:textfield name="lg1303" readonly="true"/>
		</td>
	</tr>
	<tr>
		<td>配件价格</td>
		<td>
		<s:textfield name="lg1304"/>
		</td>
	</tr>
	<tr>
		<td>配件数量</td>
		<td>
		<s:textfield name="lg1305"/>
		</td>
	</tr>
	<tr>
	<td colspan="100" align="center">
		<s:submit name="next" value="修改" onclick="return onUpdate()"/>
	    <s:submit name="next" value="返回"/>
	</td>
	</tr>
</table>
<s:hidden name="lg1301"/>	
</s:form>
</body>
</html>
