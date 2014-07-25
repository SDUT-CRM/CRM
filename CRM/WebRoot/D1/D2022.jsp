<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<html>
<head>
<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
  <title>My JSP 'D2022.jsp' starting page</title>
  <script type="text/javascript">
  	function onClick(){
  		with(document.forms[0]) {
  			action="<%=path%>/d2023Action.action";
  			submit();
  		}
  	}
  </script>
  <!-- CSS goes in the document HEAD or added to your external stylesheet -->
		<style type="text/css">
table.altrowstable {
	font-family: verdana, arial, sans-serif;
	font-size: 11px;
	color: #333333;
	border-width: 1px;
	border-color: #a9c6c9;
	border-collapse: collapse;
}

table.altrowstable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}

table.altrowstable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}

.oddrowcolor {
	background-color: #d4e3e5;
}

.evenrowcolor {
	background-color: #c3dde0;
}
</style>
</head>  
<body>
<br>
<br>
<s:property value="msg"/>
<s:form action="d2020Action">
<table border="1" width="80%" align="center" class="altrowstable" id="alternatecolor">
	<caption>
	 业务修改
	<hr width="160">
	</caption>
	<tr>
		<td>业务名称</td>
		<td>
		<s:textfield name="lg0503" cssStyle="width:300px"/>
		</td>
	</tr>
	<tr>
		<td>业务详情</td>
		<td>
		<s:textfield name="lg0504" cssStyle="width:300px"/>
		</td>
	</tr>
	<tr>
		<td>业务成本</td>
		<td>
		<s:textfield name="lg0505" cssStyle="width:300px"/>
		</td>
	</tr>
	<tr>
		<td>业务价格</td>
		<td>
		<s:textfield name="lg0506" cssStyle="width:300px"/>
		</td>
	</tr>
	<tr>
		
		<td colspan="100" align="center">
		 	<s:submit name="next" value="修改" onclick="return onClick()"/>
		 	<s:submit name="next" value="返回"/>
		</td>
	</tr>
</table>
<s:hidden name="lg0501"/>
</s:form>
</body>
</html>
