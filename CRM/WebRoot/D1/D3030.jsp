<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<html>
<head>
<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
  <title>My JSP 'D3030.jsp' starting page</title>
  <script type="text/javascript">
  	function onUpdate(obj){
  		with(document.forms[0]) {
  			action="<%=path%>/d3033Action.action?lg1301="+obj;
  			submit();
  		}
  	}
  	
  	function onSelect() {
	  	with(document.forms[0]) {
	  		next[1].disabled=false;
	  	}
	  }
	  
	  function onDelete() {
	  	with(document.forms[0]){
	  		action="<%=path%>/d3032Action.action";
	  		submit();
	  	}
	  }
	  
	  function onAdd() {
	  	with(document.forms[0]) {
	  		action="<%=path%>/D1/D3031.jsp";
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
<s:property value="msg"/>
<br>
<br>
<s:form action="">
<TABLE border="1" width="80%" align="center">
<caption>
�������
<hr width="160">
</caption>
<!-- ���ݵ��� -->
<s:if test="rows!=null">
	<TR>
	
		<TD>
			<table border="1" width="100%" class="altrowstable" id="alternatecolor">
				<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>������</td>
				<td>�������</td>
				<td>����۸�</td>
				<td>�������</td>
				<td>&nbsp;</td>
				</tr>
				<s:iterator value="rows" status="st">
					<tr>
						<td>
							<input type="radio" name="parsList"
		 			               onclick="onSelect()" value="<s:property value="lg1301"/>">		
						</td>
						<td><s:property value="#st.count"/></td>
						<td><s:property value="lg1302"/></td>
						<td><s:property value="lg1303"/></td>
						<td><s:property value="lg1304"/></td>
						<td><s:property value="lg1305"/></td>
						<td>
							<a href="#" onclick="onUpdate(<s:property value="lg1301"/>)">�޸�</a>
						</td>
					</tr>
				</s:iterator>
			</table>
			 ${requestScope.pageinfo }
		</TD>
	</TR>
</s:if>
	<TR>
	<!-- ��ť -->
		<TD colspan="100" align="center">
		<s:submit name="next" value="��������Ϣ" onclick="return onAdd()"/>
		<s:submit name="next" value="ɾ�����" onclick="return onDelete()" disabled="true"/>
		<s:submit name="next" value="����" onclick="return onNext()"/>
		</TD>
	</TR>
</TABLE>
 <input type="hidden" name="parsList" value="">
</s:form>
</body>
</html>
