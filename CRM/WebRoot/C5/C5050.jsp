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
					������Ϣ�������
					<hr width="320">
				</caption>
				<TR>
					<TD>
						����������
					</TD>
					<TD colspan="101">
						<s:textfield name="lg0202" />
					</TD>
				</TR>
				<TR>
					<TD>
						��ʼʱ��
					</TD>
					<TD>
						<s:textfield name="blg1605" />
					</TD>
					<TD>
						����ʱ��
					</TD>
					<TD>
						<s:textfield name="elg1605" />
					</TD>
				</TR>
				</TR>
				<!-- �������� -->
				<s:if test="rows!=null">
					<TR>
						<TD colspan="100">
							<table border="1" width="100%">
								<tr>
									<td>
										&nbsp;
									</td>
									<td>
										���
									</td>
									<td>
										����������
									</td>
									<td>
										�������
									</td>
									<td>
										�������
									</td>
									<td>���״̬</td>
									<td>
										����ʱ��
									</td>
									<td>
										���ʱ��
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
				<!-- ��ť -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="��ѯ" name="next" />
						<s:submit value="ͨ��" name="next" onclick="return onNext2('2')"
							disabled="true" />
						<s:submit value="�ܾ�" name="next" onclick="return onNext2('3')"
							disabled="true" />
					</TD>
				</TR>
			</TABLE>
			<input type="hidden" name="parsList">
		</s:form>
	</body>
</html>
