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
<s:form action="d1010Action">
	<table border="1" align="center" width="80%" class="altrowstable" id="alternatecolor">
		<tr>
			<td>姓名</td>
			<td>
				<s:textfield name="name"/>
			</td>
		</tr>
		<tr>
			<td>身份证号码</td>
			<td>
			<s:textfield name="idcard"/>
			</td>
		</tr>
		<tr>
			<td>住址</td>
			<td>
			<s:textfield name="address"/>
			</td>
		</tr>
		<tr>
			<td>手机号码</td>
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
				<s:submit name="next" value="添加经理" cssStyle="width:153px" onclick="return onNext()"/>
				<s:submit name="next" value="返回" cssStyle="width:153px"/>
			</td>
		</tr>
	</table>
</s:form>
</body>
</html>
