<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
		<script type="text/javascript">
		var count = 0;
	function onSelect(obj) {
		with (document.forms[0]) {
			obj ? ++count : --count;
			next[2].disabled = (count == 0);
			next[1].disabled = (count == 0);
		}
	}
		function onNext2(obj)
		{
			with(document.forms[0])
			{
				action="<%=path%>/c5052Action.action?type=" + obj;
		}
	}
</script>
	</head>
	<body>
		<s:form action="c5051Action">
			<TABLE border="1" align="center" width="1000px">
				<caption>
					费用信息管理界面
					<hr width="320">
				</caption>
				<TR>
					<TD>
						申请人姓名
					</TD>
					<TD colspan="101">
						<s:textfield name="lg0202" />
					</TD>
				</TR>
				<TR>
					<TD>
						开始时间
					</TD>
					<TD>
						<s:textfield name="blg1605" />
					</TD>
					<TD>
						结束时间
					</TD>
					<TD>
						<s:textfield name="elg1605" />
					</TD>
				</TR>
				</TR>
				<!-- 迭代数据 -->
				<s:if test="rows!=null">
					<TR>
						<TD colspan="100">
							<table border="1" width="100%">
								<tr>
									<td>
										&nbsp;
									</td>
									<td>
										序号
									</td>
									<td>
										申请人姓名
									</td>
									<td>
										报销类别
									</td>
									<td>
										报销金额
									</td>
									<td>审核状态</td>
									<td>
										申请时间
									</td>
									<td>
										审核时间
									</td>
								</tr>
								<s:iterator value="rows" status="st">
									<tr>
										<td>
											<s:if test="lg1603==1">
												<input type="checkbox" name="parsList"
													onclick="onSelect(this.checked)"
													value="<s:property value="lg1601"/>">
											</s:if>
											<s:else>
									    &nbsp;&nbsp;
									    </s:else>
										</td>
										<td>
											<s:property value="#st.count" />
										</td>
										<td>
											<s:property value="lg0202" />
										</td>
										<td>
											<s:property value="cnlg1503" />
										</td>
										<td>
											<s:property value="lg1606" />
										</td>
										<td>
											<s:property value="cnlg1603"/>
										</td>
										<td>
											<s:property value="lg1602" />
										</td>
										<s:if test="lg1603!=1">
										<td>
											<s:property value="lg1604" />
										</td>
										</s:if>
										<s:else>
										<td>&nbsp;</td>
										</s:else>
										
								
									</tr>
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
						<s:submit value="通过" name="next" onclick="return onNext2('2')"
							disabled="true" />
						<s:submit value="拒绝" name="next" onclick="return onNext2('3')"
							disabled="true" />
					</TD>
				</TR>
			</TABLE>
			<input type="hidden" name="parsList">
		</s:form>
	</body>
</html>
