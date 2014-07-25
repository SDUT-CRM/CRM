<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
    String path = request.getContextPath();
%>

<html>
	<head>
	<style type="text/css">
	a
	{
		font-weight:bold;
		font-size:150%;
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
				<TD height="750px" width="120px" valign="top">
				<!-- 目录 -->
				
					<s:if test="#session.USERINFO.lg2105==1">
					<table>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/A1/a1010Action.action" target="WORK">业务办理</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/A1/a1013Action.action" target="WORK">办理详情</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/A1/a1020Action.action" target="WORK">查看活动</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/A1/a1023Action.action" target="WORK">参加详情</a>
							</td>
						</tr>
												<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/A1/a1030Action.action" target="WORK">在线报修</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/A1/a1032Action.action" target="WORK">我的报单</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/A1/A1040.jsp" target="WORK">在线提问</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/A1/a1041Action.action" target="WORK">提问历史</a>
							</td>
						</tr>
					</table>
					</s:if>
					
					<s:if test="#session.USERINFO.lg2105==2">
					<table>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/b1010Action.action" target="WORK">客户管理</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/b1020Action.action" target="WORK">客户申请审核</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/b1022Action.action" target="WORK">审核记录</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/b1024Action.action" target="WORK">客户提问答复</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path %>/b1030Action.action" target="WORK">查看新报修</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path %>/b1033Action.action" target="WORK">受理记录</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path %>/b1041Action.action" target="WORK">配件申请</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path %>/b1040Action.action" target="WORK">配件申请记录</a>
							</td>
						</tr>
					</table>					
					</s:if>
					<!-- 员工的目录 -->
					<!-- 经理的目录 -->
					<s:if test="#session.USERINFO.lg2105==3" >
					<table>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/c1011Action.action" target="WORK">员工管理</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/c2021Action.action" target="WORK">配件申请管理</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/c2030Action.action" target="WORK">配件信息管理</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path%>/c3030Action.action" target="WORK">活动信息</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path %>/c4041Action.action" target="WORK">经营信息</a>
							</td>
						</tr>
						<tr>
							<td nowrap="nowrap">
								<a href="<%=path %>/c5050Action.action" target="WORK">费用管理</a>
							</td>
						</tr>
					</table>
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
