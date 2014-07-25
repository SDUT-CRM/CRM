<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
%>
<html>
<head>
<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
 <title>My JSP 'D2021.jsp' starting page</title>
 <script type="text/javascript">
 function onNext() {
 	with(document.forms[0]) {
 		action="<%=path%>/d2020Action.action";
 	}
 }
 </script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="d2021Action">
<table border="1" width="80%" align="center">
 	<caption>
 	业务添加
 	<hr width="160">
 	</caption>
 	<tr>
 	<td>业务编号</td>
 	<td>
 	<s:textfield name="lg0502"/>
 	</td>
 	</tr>
 	<tr>
 	<td>业务名称</td>
 	<td>
 	<s:textfield name="lg0503"/>
 	</td>
 	</tr>
 	<tr>
 	<td>业务详情</td>
 	<td>
 	<s:textfield name="lg0504"/>
 	</td>
 	</tr>
 	<tr>
 	<td>业务成本</td>
 	<td>
 	<s:textfield name="lg0505"/>
 	</td>
 	</tr>
 	<tr>
 	<td>业务价格</td>
 	<td>
 	<s:textfield name="lg0506"/>
 	</td>
 	</tr>
 	<tr>
 	<td colspan="100" align="center">
 	<s:submit name="next" value="添加"/>
 	<s:submit name="next" value="返回" onclick="return onNext()"/>
 	</td>
 	</tr>
</table>
</s:form>
</body>
</html>
