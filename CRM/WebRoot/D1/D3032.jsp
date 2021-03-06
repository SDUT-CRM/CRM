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
  <script type="text/javascript">
function altRows(id){
	if(document.getElementsByTagName){  
		
		var table = document.getElementById(id);  
		var rows = table.getElementsByTagName("tr"); 
		 
		for(i = 0; i < rows.length; i++){          
			if(i % 2 == 0){
				rows[i].className = "evenrowcolor";
			}else{
				rows[i].className = "oddrowcolor";
			}      
		}
	}
}

window.onload=function(){
	altRows('alternatecolor');
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
<s:property value="msg"/>
<br>
<br>
<s:form action="d3030Action">
<table border="1" width="80%" align="center" class="altrowstable" id="alternatecolor">
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
