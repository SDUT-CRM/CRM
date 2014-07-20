<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  <body>
  <!-- 客户的目录 -->
  <!-- 员工的目录 -->
  <!-- 经理的目录 -->
  <table>
  <tr><td>员工管理</td></tr>
  <tr><td>配件管理</td></tr>
  <tr><td>活动管理</td></tr>
  <tr><td>报表管理</td></tr>
  <tr><td>费用管理</td></tr>
  <tr><td>调查问卷</td></tr>
  </table>
  <!-- 管理员的目录 -->
  </body>
</html>
