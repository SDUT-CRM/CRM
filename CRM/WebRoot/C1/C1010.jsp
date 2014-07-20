<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
		<link href="<%=path%>/C1/css/style.css" rel="stylesheet"
			type="text/css" media="screen" />
		<link href="<%=path%>/C1/css/core.css" rel="stylesheet"
			type="text/css" media="screen" />
		<link href="<%=path%>/C1/css/print.css" rel="stylesheet"
			type="text/css" media="print" />
		<link href="<%=path%>/C1/css/uploadify.css" rel="stylesheet"
			type="text/css" media="screen" />
	</head>
	<body>
		<TABLE>
			<TR>
				<TD>Ô±¹¤ÐÕÃû</TD>
				<TD>
				<s:textfield cssClass=""/>
				</TD>
				<TD></TD>
				<TD></TD>
			</TR>
		</TABLE>
	</body>
</html>
