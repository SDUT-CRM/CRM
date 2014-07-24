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
</script>
	</head>
	<body>
		<s:form action="c3031Action">
			<TABLE border="1" align="center" width="1000px">
				<caption>
					活动管理界面
					<hr width="320">
				</caption>
				<!-- 迭代数据 -->
				<s:if test="rows!=null">
				<TR><TD colspan="100"><table border="1" width="100%">
					<TR>
					<TD>&nbsp;</TD>
						<TD>
							序号
						</TD>
						<TD>
							活动名称
						</TD>
						
						<TD>
						    参与者姓名
						</TD>
						
						<TD>
						  审核状态
						</TD>
						

					</TR>
					<s:iterator value="rows" status="st">
						<TR>
							<TD>
							<s:if test="lg0804==1">
											<input type="checkbox" name="parsList" 
												onclick="onSelect(this.checked)" 
												value="<s:property value="lg1401"/>" >
									    </s:if>
							</TD>
							<TD>
								<s:property value="#st.count" />
							</TD>

							<TD>
								<s:property value="lg0702" />
							</TD>
							<TD>
								<s:property value="lg0102" />
							</TD>
							<TD>
							    <s:property value="cnlg0804"/>
							</TD>
						</TR>
					</s:iterator>
					</table>
					${requestScope.pageinfo }
					</TD></TR>
				</s:if>
				<!-- 按钮 -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="拒绝" name="next" onclick="return onNext3('4')"
							disabled="true" />
					    <s:submit value="返回" name="next"/>
					</TD>
				</TR>
			</TABLE>
			<input type="hidden" name="parsList">
		</s:form>
	</body>
</html>
