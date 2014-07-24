<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
    String path = request.getContextPath();
%>

<html>
	<head>
	</head>
	<body>
		<TABLE width="100%" border="1">
			<TR>
				<TD height="80px" colspan="100">
					<!-- 页眉 -->
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
								<a href="#" target="WORK">调查问卷</a>
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
								<a href="<%=path%>/c2021Action.action" target="WORK">配件管理</a>
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
								<a href="#" target="WORK">费用管理</a>
							</td>
						</tr>
						<tr>
							<td>
								<a href="#" target="WORK">调查问卷</a>
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
				<TD height="80px" colspan="100">
				<!-- 页脚 -->
				aa
				</TD>
			</TR>
		</TABLE>
	</body>
</html>
