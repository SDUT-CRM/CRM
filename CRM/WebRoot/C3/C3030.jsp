<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
	<script type="text/javascript" src="<%=path%>/js/calendar.js"></script>
		<script type="text/javascript">
	function onEdit(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/c3040Action.action?lg0701="+obj;
			submit();
		}
	}
</script>
	</head>
	<body>
		<s:form action="c3031Action">
			<TABLE border="1" align="center" width="1000px">
				<caption>
					���Ϣ�������
					<hr width="320">
				</caption>
				<TR>
					<TD>
						�����
					</TD>
					<TD>
						<s:textfield name="qlg0702" />
					</TD>
					<TD>
						�����
					</TD>
					<TD>
						<s:textfield name="qlg0703" />
					</TD>
				</TR>
				<TR>
					<TD>
						������
					</TD>
					<TD>
						<s:textfield name="qlg0302" />
					</TD>
					<TD>
						�״̬
					</TD>
					<TD>
						<s:select name="qlg0707" list="oclg0707" listKey="key"
							listValue="value" headerKey="" headerValue="==����=="
							cssStyle="width:153px" />
					</TD>
				</TR>
				<TR>
					<TD>
						������ʼʱ��
					</TD>
					<TD>
						<s:textfield name="blg0706" onclick="calendar.show(this);" />
					</TD>
					<TD>
						������ֹʱ��
					</TD>
					<TD>
						<s:textfield name="elg0706" onclick="calendar.show(this);" />
					</TD>
				</TR>
				<TR>
					<TD>
						���ʼʱ��
					</TD>
					<TD>
						<s:textfield name="blg0708" onclick="calendar.show(this);" />
					</TD>
					<TD>
						���ֹʱ��
					</TD>
					<TD>
						<s:textfield name="elg0708" onclick="calendar.show(this);" />
					</TD>
				</TR>
				<!-- �������� -->
				<s:if test="rows!=null">
				<TR><TD colspan="100"><table border="1" width="100%">
					<TR>
		

						<TD>
							���
						</TD>

						<TD>
							�����
						</TD>

						<TD>
							�����
						</TD>

						<TD>
							Ԥ��
						</TD>

						<TD>
							����
						</TD>

						<TD>
							������ֹʱ��
						</TD>

						<TD>
							���лʱ��
						</TD>

						<TD>
							������
						</TD>
						
						<TD>
							����
						</TD>

					</TR>
					<s:iterator value="rows" status="st">
						<TR>
					
							<TD>
								<s:property value="#st.count" />
							</TD>

							<TD>
								<s:property value="lg0702" />
							</TD>

							<TD>
								<s:property value="lg0703" />
							</TD>

							<TD>
								<s:property value="lg0704" />
							</TD>

							<TD>
								<s:property value="lg0705" />
							</TD>

							<TD>
								<s:property value="lg0706" />
							</TD>

							<TD>
								<s:property value="lg0708" />
							</TD>

							<TD>
								<s:property value="lg0302" />
							</TD>

							<TD>
								<a href="#" onclick="onEdit(<s:property value="lg0701"/>)">����</a>
							</TD>
							
						</TR>
					</s:iterator>
					</table>
					${requestScope.pageinfo }
					</TD></TR>
				</s:if>
				<!-- ��ť -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="��ѯ" name="next" />
					</TD>
				</TR>
			</TABLE>
			<input type="hidden" name="parsList">
		</s:form>
	</body>
</html>
