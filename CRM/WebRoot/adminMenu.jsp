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
		 	<!-- 页眉 -->
		</TD>
	</TR>
	<TR>
		<TD height="750px" width="120px" valign="top"">
		<!-- 目录 -->
			<!-- 客户目录 -->
			<!-- 员工目录 -->
			<!-- 经理目录 -->
			<!-- 管理员目录 -->
			<!-- 管理员的目录 -->
			<table>
			    <tr>
				    <td>
				    <a href="<%=path%>/d1010Action.action" target="WORK">人员管理</a>
				    </td>
			    </tr>
			    <tr>
				    <td>
				    <a href="<%=path%>/d2020Action.action" target="WORK">业务管理</a>
				    </td>
			    </tr>
			    <tr>
				    <td>
				    <a href="<%=path%>/d3030Action.action" target="WORK">配件管理</a>
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
		<!-- 页脚 -->
		zz
		</TD>
	</TR>
</TABLE>
</s:form>
</body>
</html>
