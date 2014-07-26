<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
    String path = request.getContextPath();
%>

<html>
	<head>
	<script type="text/javascript"> 
$(document).ready(function(){
		
	$("ul.sidenav li").hover(function() {
		$(this).find("div").stop()
		.animate({left: "210", opacity:1}, "fast")
		.css("display","block")

	}, function() {
		$(this).find("div").stop()
		.animate({left: "0", opacity: 0}, "fast")
	});
	
});
</script>
<style type="text/css">
	body 
	{
		background: #005094;
		font: 10px Verdana, Arial, Helvetica, sans-serif;
		margin: 0;
		padding: 0;
	}
	a:focus
	{
		outline: none;
	}
	* 
	{
		margin: 0;
		padding: 0;
	}
	h1 
	{
		font: 4.7em normal Georgia, 'Times New Roman', Times, serif;
		color: #fff;
		margin-bottom: 20px;
	}
	h1 small
	{
		font: 0.2em normal Verdana, Arial, Helvetica, sans-serif;
		text-transform:uppercase;
		letter-spacing: 1.5em;
		display: block;
		color: #fff;
	}
	h2 
	{
		font: 2em normal Georgia, 'Times New Roman', Times, serif;
	}
	.container 
	{
		margin: 0 auto;
		width: 900px;
		background: #005094;
		overflow: hidden;
		padding: 20px;
	}
	.content 
	{
		width: 639px;
		padding: 20px;
		margin-left: 20px;
		color: #ddd;
		font-size: 1.2em;
		float: left;
		border-left: 1px dashed #003867;
	}
	.content p 
	{
		line-height: 1.6em;
		margin: 5px 0;
		padding: 5px 0;
	}
	ul.sidenav 
	{
		float: left;
		margin: 130px 0 0;
		padding: 0;
		width: 200px;
		list-style: none;
		border-bottom: 1px solid #3373a9;
		border-top: 1px solid #003867;
		font-size: 1.2em;
	}
	ul.sidenav li 
	{
		position: relative;
		float: left;
		margin: 0;
		padding: 0;
	}
	ul.sidenav li a
	{
		border-top: 1px solid #3373a9;
		border-bottom: 1px solid #003867;
		padding: 10px 10px 10px 25px;
		display: block;
		color: #fff;
		text-decoration: none;
		width: 165px;
		background: #005094 url(sidenav_li_a.gif) no-repeat 5px 10px;
		position: relative;
		z-index: 2;
	}
	ul.sidenav li a:hover 
	{
		background-color: #004c8d;
		border-top: 1px solid #1a4c76;
	}
	ul.sidenav li div 
	{
		display: none;
		position: absolute;
		top: 2px;
		left: 0;
		width: 225px;
		font-size: 0.9em;
		background: url(bubble_top.gif) no-repeat right top;
	}
	ul.sidenav li div p 
	{
		margin: 7px 0;
		line-height: 1.6em;
		padding: 0 5px 10px 30px;
		background: url(bubble_btm.gif) no-repeat right bottom;
	}
	</style>
	<style type="text/css">
	a
	{
		font-weight:bold;
		font-size:120%;
		text-decoration:none;
		color:#0000FF;
	}
	body
	{
	    
		background-color:#6795AB;
		background-image:url("<%=path%>/imgs/body_repeat.jpg");
		background-repeat:repeat-x;
		background-position:center 0;
	}
	</style>
	</head>
	<body>
		<TABLE width="100%" border="0">
			<TR>
				<TD height="80px" colspan="100" align="center">
				</TD>
			</TR>
			<TR>
				<TD height="644px" width="120px" valign="top">
				<!-- 目录 -->
				
					<s:if test="#session.USERINFO.lg2105==1">
					<ul class="sidenav">
					<li>
						<a href="<%=path%>/A1/a1010Action.action" target="WORK">业务办理</a>
					</li>
					<li>
						<a href="<%=path%>/A1/a1013Action.action" target="WORK">办理详情</a>
					</li>
					<li>
					    <a href="<%=path%>/A1/a1020Action.action" target="WORK">查看活动</a>
					</li>
					<li>
						<a href="<%=path%>/A1/a1023Action.action" target="WORK">参加详情</a>
					</li>
					<li>
						<a href="<%=path%>/A1/a1030Action.action" target="WORK">在线报修</a>
					</li>
					<li>
						<a href="<%=path%>/A1/a1032Action.action" target="WORK">我的报单</a>
					</li>
					<li>
						<a href="<%=path%>/A1/A1040.jsp" target="WORK">在线提问</a>
					</li>
					<li>
						<a href="<%=path%>/A1/a1041Action.action" target="WORK">提问历史</a>
					</li>
					</ul>
					</s:if>
										<!-- 员工的目录 -->
					<s:if test="#session.USERINFO.lg2105==2">
					<ul class="sidenav">
					<li>
						<a href="<%=path%>/b1010Action.action" target="WORK">客户管理</a>
					</li>
					<li>
						<a href="<%=path%>/b1020Action.action" target="WORK">客户申请审核</a>
					</li>
					<li>
						<a href="<%=path%>/b1022Action.action" target="WORK">审核记录</a>
					</li>
					<li>
						<a href="<%=path%>/b1024Action.action" target="WORK">客户提问答复</a>
					</li>
					<li>
						<a href="<%=path %>/b1030Action.action" target="WORK">查看新报修</a>
					</li>
					<li>
						<a href="<%=path %>/b1033Action.action" target="WORK">受理记录</a>
					</li>
					<li>
						<a href="<%=path %>/b1041Action.action" target="WORK">配件申请</a>
					</li>
					<li>
						<a href="<%=path %>/b1040Action.action" target="WORK">配件申请记录</a>
					</li>
					</ul>				
					</s:if>
					<!-- 经理的目录 -->
					<s:if test="#session.USERINFO.lg2105==3" >
					<ul class="sidenav">
					<li>
								<a href="<%=path%>/c1011Action.action" target="WORK">员工管理</a>
					</li>
					<li>
								<a href="<%=path%>/c2021Action.action" target="WORK">配件申请管理</a>
					</li>
					<li>
								<a href="<%=path%>/c2030Action.action" target="WORK">配件信息管理</a>
					</li>
					<li>
								<a href="<%=path%>/c3030Action.action" target="WORK">活动信息</a>
					</li>
					<li>
								<a href="<%=path %>/c4041Action.action" target="WORK">经营信息</a>
					</li>
					<li>
								<a href="<%=path %>/c5050Action.action" target="WORK">费用管理</a>
					</li>
					</ul>
					</s:if>
					<s:if test="#session.USERINFO.lg2105==4" >
					<ul class="sidenav">
					<li>
								<a href="<%=path%>/d1010Action.action" target="WORK">人员管理</a>
					</li>
					<li>
								<a href="<%=path%>/d2020Action.action" target="WORK">业务管理</a>
					</li>
					<li>
								<a href="<%=path%>/d3030Action.action" target="WORK">业务管理</a>
					</li>
					</ul>					
					</s:if>
					<!-- 管理员的目录 -->
				</TD>
				<TD>
				<!-- 工作区 -->
				<iframe name="WORK" width="100%" height="100%" frameborder="0"></iframe>
				</TD>
			</TR>
			<TR>
				<TD height="80px" colspan="100" align="center">
				<!-- 页脚 -->
				Power by SDUT-CRM group
				</TD>
			</TR>
		</TABLE>
	</body>
</html>
