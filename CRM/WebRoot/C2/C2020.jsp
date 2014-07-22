<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
	<script type="text/javascript">
	</script>
	</head>
	<body>
		<s:form action="c1010Action">
			<TABLE border="1" align="center" width="850px">
				<caption>
					配件信息管理界面
					<hr width="320">
				</caption>
				<TR>
					<TD>
						配件编号
					</TD>
					<TD>
						<s:textfield name="qlg1302" />
					</TD>
					<TD>
						员工部门
					</TD>
					<TD>
						<s:select name="qlg0401" list="oclg0401" listKey="key"
							listValue="value" headerKey="" headerValue="==不限=="
							cssStyle="width:153px" />
					</TD>
				</TR>
				<TR>
					<TD>
						员工姓名
					</TD>
					<TD>
						<s:textfield name="qlg0202" />
					</TD>
					<TD>
						员工状态
					</TD>
					<TD>
						<s:select name="qlg0207" list="oclg0207" listKey="key"
							listValue="value" headerKey="" headerValue="==不限=="
							cssStyle="width:153px" />
					</TD>
				</TR>
				<TR>
					<TD>
						入职时间(起始)
					</TD>
					<TD>
						<s:textfield name="blg0208" />
					</TD>
					<TD>
						入职时间(结束)
					</TD>
					<TD>
						<s:textfield name="elg0208" />
					</TD>
				</TR>
				<!-- 迭代数据 -->
				<s:if test="rows!=null">
					<TR>
						<TD colspan="100">
							<table border="1" width="100%">
								<tr>
									<td>
										序号
									</td>
									<td>
										员工编号
									</td>
									<td>
										员工姓名
									</td>
									<td>
										员工部门
									</td>
									<td>
										员工状态
									</td>
									<td>
										入职时间
									</td>
									<td>
										&nbsp;
									</td>
								</tr>
								<s:iterator value="rows" status="st">
									
								</s:iterator>
							</table>
							${requestScope.pageinfo }
						</TD>
					</TR>
				</s:if>
				<s:else>
					<TR>
						<TD colspan="100">
							<s:property value="msg" />
						</TD>
					</TR>
				</s:else>
				<!-- 按钮 -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="查询" name="next" />
						<s:submit value="添加" name="next2" onclick="return onNext2()" />
					</TD>
				</TR>
			</TABLE>
		</s:form>
	</body>
</html>
