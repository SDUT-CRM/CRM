<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"  %>
<%
String path = request.getContextPath();
%>
<html>
<head>
  <title>My JSP 'adminMenu.jsp' starting page</title>
</head>
<body>
<s:form>
<TABLE width="100%" align="center" border="1">
	<TR>
		<TD height="80px" colspan="100">
		 	<!-- ҳü -->
		</TD>
	</TR>
	<TR>
		<TD height="750px" width="120px" valign="top"">
		<!-- Ŀ¼ -->
			<!-- �ͻ�Ŀ¼ -->
			<!-- Ա��Ŀ¼ -->
			<!-- ����Ŀ¼ -->
			<!-- ����ԱĿ¼ -->
			<!-- ����Ա��Ŀ¼ -->
			<table>
			    <tr>
				    <td>
				    <a href="<%=path%>/d1010Action.action" target="WORK">��Ա����</a>
				    </td>
			    </tr>
			    <tr>
				    <td>
				    <a href="<%=path%>/d2020Action.action" target="WORK">ҵ�����</a>
				    </td>
			    </tr>
			    <tr>
				    <td>
				    <a href="<%=path%>/d3030Action.action" target="WORK">�������</a>
				    </td>
			    </tr>
			</table>
		</TD>
		<TD>
		<iframe name="WORK" width="100%" height="100%" frameborder="0"></iframe>
		</TD>
		
	</TR>
	<TR>
		<TD height="80px" colspan="100">
		<!-- ҳ�� -->
		zz
		</TD>
	</TR>
</TABLE>
</s:form>
</body>
</html>
