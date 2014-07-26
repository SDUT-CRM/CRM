<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>电信CRM管理平台</title>
<link href="css/login.css" rel="stylesheet" type="text/css" />
</head>
<div id="login">
	<div id="login_header">
		<h1 class="login_logo">
			<a href="http://demo.dwzjs.com"><img src="images/login_logo.gif" /></a>
		</h1>
		<div class="login_headerContent">
			<div class="navList">
				<ul>
					<li><a href="#">设为首页</a></li>
					<li><a href="http://bbs.dwzjs.com">反馈</a></li>
					<li><a href="doc/dwz-user-guide.pdf" target="_blank">帮助</a></li>
				</ul>
			</div>
			<h2 class="login_title"><img src="images/login_title.png" /></h2>
		</div>
	</div>
	<div id="login_content">
		<div class="loginForm">
			<form action="loginAction.action" method="post">
			<s:property value="msg"/>
				<p>
					<label>用户名：</label>
					<input type="text" name="username" size="20" class="login_input" />
				</p>
				<p>
					<label>密码：</label>
					<input type="password" name="pwd" size="20" class="login_input" />
				</p>
				<div class="login_bar">
					<input class="sub" name = "next" type="submit" value=" " />
				</div>
			</form>
		</div>
		<div class="login_banner"><img src="images/login_banner.jpg" /></div>
		<div class="login_main">
		</div>
	</div>
	<div id="login_footer">
		Copyright &copy; 2014 SDUT-CRM. All Rights Reserved.
	</div>
</div>
<body>
</body>
</html>
