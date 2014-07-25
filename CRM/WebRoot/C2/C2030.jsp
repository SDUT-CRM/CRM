<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
		<script type="text/javascript">
	function onEdit(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/c2032Action.action?lg1301="+obj;
			submit();
		}
	}
	function onNext2()
	{
		with(document.forms[0])
		{
			action="<%=path%>/c2034Action.action";
		}
	}
</script>
	</head>
	<body>
		<s:property value="msg" />
		<s:form action="c2031Action">

			<TABLE border="1" align="center" width="1000px">
				<caption>
					配件信息管理页面
					<hr width="300px">
				</caption>
				<TR>
					<TD>
						配件编号
					</TD>
					<TD>
						<s:textfield name="qlg1302" />
					</TD>
				</TR>
				<TR>
					<TD>
						配件名称
					</TD>
					<TD>
						<s:textfield name="qlg1303" />
					</TD>
				</TR>
				<s:if test="rows!=null">
					<TR>
						<TD colspan="100">
							<table width="100%" border="1">

								<tr>
									<td>
										序号
									</td>
									<td>
										配件编号
									</td>
									<td>
										配件名称
									</td>
									<td>
										配件价格
									</td>
									<td>
										配件数量
									</td>
									<td>
										&nbsp;
									</td>
								</tr>
								<s:iterator value="rows" status="st">
									<tr>
										<td>
											<s:property value="#st.count" />
										</td>
										<td>
											<s:property value="lg1302" />
										</td>
										<td>
											<s:property value="lg1303" />
										</td>
										<td>
											<s:property value="lg1304" />
										</td>
										<td>
											<s:property value="lg1305" />
										</td>
										<td>
											<a href="#" onclick="onEdit(<s:property value="lg1301" />)">修改</a>
										</td>
									</tr>
								</s:iterator>
							</table>
							${requestScope.pageinfo }
						</TD>
					</TR>
				</s:if>
				<s:else>
					<TR>
						<TD colspan="100" align="center">
							<s:property value="msg" />
						</TD>
					</TR>
				</s:else>
				<TR>
					<TD colspan="100" align="center">
						<s:submit name="next" value="查询" />
						<s:submit name="next" value="添加" onclick="return onNext2()" />
					</TD>
				</TR>
			</TABLE>
		</s:form>
	</body>
</html>
