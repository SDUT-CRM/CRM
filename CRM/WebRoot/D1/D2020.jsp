<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<html>
<head>
<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
	<title>My JSP 'D2020.jsp' starting page</title>
	<script type="text/javascript">
	  function onSelect() {
	  	with(document.forms[0]) {
	  		next[1].disabled=false;
	  	}
	  }
	
	  function onInfo(obj) {
	  	with(document.forms[0]) {
	  		action="<%=path%>/D1/d2024Action.action?lg0501="+obj;
	  		submit();
	  	}
	  }
	  
	  function onUpdate(obj) {
	  	with(document.forms[0]) {
	  		action="<%=path%>/D1/d20232Action.action?lg0501="+obj;
	  		submit();
	  	}
	  }
	  
	   function onDelete() {
  		 with(document.forms[0]) {
  		 	action="<%=path%>/d2022Action.action";
  			submit();
  	}
  }
  
  function onAdd() {
  	with(document.forms[0]) {
  		action="<%=path%>/D1/D2021.jsp";
  	}
  }
  
  function onNext() {
  	with(document.forms[0]) {
  		action="/adminMenu.jsp";
  	}
  }
	</script>
	
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="d2020Action">
<TABLE border="1" width="80%" align="center">
<caption>
ҵ�����
<hr width="160">
</caption>
<!-- ���ݵ��� -->
<s:if test="rows!=null">
	<TR>
	
		<TD>
			<table border="1" width="100%">
				<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>ҵ����</td>
				<td>����</td>
				<td>ҵ��״̬</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				</tr>
				<s:iterator value="rows" status="st">
					<tr>
						<td>
							<input type="radio" name="parsList"
		 			               onclick="onSelect()" value="<s:property value="lg0501"/>">		
						</td>
						<td><s:property value="#st.count"/></td>
						<td><s:property value="lg0502"/></td>
						<td><s:property value="lg0503"/></td>
						<td><s:property value="cnlg0509"/></td>
						<td>
							<a href="#" onclick="onInfo(<s:property value="lg0501"/>)">�鿴����</a>
						</td>
						<td>
							<a href="#" onclick="onUpdate(<s:property value="lg0501"/>)">�޸�</a>
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
		<s:submit name="next" value="���ҵ��" onclick="return onAdd()"/>
		<s:submit name="next" value="ͣ��ҵ��" onclick="return onDelete()" disabled="true"/>
		<s:submit name="next" value="����" onclick="return onNext()"/>
		</TD>
	</TR>
</TABLE>
 <input type="hidden" name="parsList" value="">
 <s:hidden name="lg0501"/>
</s:form>
</body>
</html>
