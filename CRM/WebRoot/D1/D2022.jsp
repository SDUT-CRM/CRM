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
</head>  
<body>
<br>
<br>
<s:property value="msg"/>
<s:form action="d2020Action">
<table border="1" width="80%" align="center">
	<caption>
	 ҵ���޸�
	<hr width="160">
	</caption>
	<tr>
		<td>ҵ������</td>
		<td>
		<s:textfield name="lg0503" cssStyle="width:300px"/>
		</td>
	</tr>
	<tr>
		<td>ҵ������</td>
		<td>
		<s:textfield name="lg0504" cssStyle="width:300px"/>
		</td>
	</tr>
	<tr>
		<td>ҵ��ɱ�</td>
		<td>
		<s:textfield name="lg0505" cssStyle="width:300px"/>
		</td>
	</tr>
	<tr>
		<td>ҵ��۸�</td>
		<td>
		<s:textfield name="lg0506" cssStyle="width:300px"/>
		</td>
	</tr>
	<tr>
		
		<td colspan="100" align="center">
		 	<s:submit name="next" value="�޸�" onclick="return onClick()"/>
		 	<s:submit name="next" value="����"/>
		</td>
	</tr>
</table>
<s:hidden name="lg0501"/>
</s:form>
</body>
</html>
