<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
    String path = request.getContextPath();
%>

<html>
	<head>
	<style type="text/css">
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
					<!-- 客户的目录 -->
					<table>
						<tr>
							<td>
								<a href="<%=path%>/A1/a1010Action.action" target="WORK">业务办理</a>
							</td>
						</tr>
						<tr>
							<td>
								<a href="<%=path%>/A1/a1013Action.action" target="WORK">办理详情</a>
							</td>
						</tr>
						<tr>
							<td>
								<a href="<%=path%>/A1/a1020Action.action" target="WORK">查看活动</a>
							</td>
						</tr>
						<tr>
							<td>
								<a href="<%=path%>/A1/a1023Action.action" target="WORK">参加详情</a>
							</td>
						</tr>
												<tr>
							<td>
								<a href="<%=path%>/A1/a1030Action.action" target="WORK">在线报修</a>
							</td>
						</tr>
						<tr>
							<td>
								<a href="<%=path%>/A1/a1032Action.action" target="WORK">我的报单</a>
							</td>
						</tr>
						<tr>
							<td>
								<a href="<%=path%>/A1/A1040.jsp" target="WORK">在线提问</a>
							</td>
						</tr>
						<tr>
							<td>
								<a href="<%=path%>/A1/a1041Action.action" target="WORK">提问历史</a>
							</td>
						</tr>
					</table>
					<!-- 员工的目录 -->
					<!-- 经理的目录 -->
					<hr width="60">
					<table>
						<tr>
							<td>
								<a href="<%=path%>/c1011Action.action" target="WORK">员工管理</a>
							</td>
						</tr>
						<tr>
							<td>
								<a href="<%=path%>/c2021Action.action" target="WORK">配件申请管理</a>
							</td>
						</tr>
						<tr>
							<td>
								<a href="<%=path%>/c2030Action.action" target="WORK">配件信息管理</a>
							</td>
						</tr>
						<tr>
							<td>
								<a href="<%=path%>/c3030Action.action" target="WORK">活动信息</a>
							</td>
						</tr>
						<tr>
							<td>
								<a href="<%=path %>/c4041Action.action" target="WORK">经营信息</a>
							</td>
						</tr>
						<tr>
							<td>
								<a href="<%=path %>/c5050Action.action" target="WORK">费用管理</a>
							</td>
						</tr>
					</table>
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
