<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
%>
<html>
<head>
<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
    <title>My JSP 'D3031.jsp' starting page</title>
    <script type="text/javascript">
    function onNext() {
    	with(document.forms[0]){
    		action="<%=path%>/d3030Action.action";
    	}
    }
    </script>
</head>  
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="d3031Action">
<table border="1" width="80%" align="center">
<caption>
配件添加
<hr width="160">
</caption>
	<tr>
		<td>配件编号</td>
		<td>
		<s:textfield name="lg1302"/>
		</td>
	</tr>
	<tr>
		<td>配件名称</td>
		<td>
		<s:textfield name="lg1303"/>
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
		<s:submit name="next" value="添加"/>
		<s:submit name="next" value="返回" onclick="return onNext()"/>
		</td>
	</tr>
</table>
</s:form>
</body>
</html>
