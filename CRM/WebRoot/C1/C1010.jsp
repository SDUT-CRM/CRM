<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
	</head>
	<body>
		<s:form action="c1010Action">
			<TABLE border="1" align="center" width="850px">
				<caption>
					Ա����Ϣ�������
					<hr width="320">
				</caption>
				<TR>
					<TD>
						Ա�����
					</TD>
					<TD>
						<s:textfield name="lg2102" />
					</TD>
					<TD>
						Ա������
					</TD>
					<TD>
						<s:select name="qlg0401" list="oclg0401" 
						listKey="key" listValue="value" 
						headerKey="" headerValue="==����=="
					    cssStyle="width:153px" />
					</TD>
				</TR>
				<TR>
					<TD>
						Ա������
					</TD>
					<TD>
						<s:textfield name="lg0202" />
					</TD>
					<TD>
						Ա��״̬
					</TD>
					<TD>
						<s:select name="qlg0207" list="oclg0207" 
						listKey="key" listValue="value" 
						headerKey="" headerValue="==����=="
					    cssStyle="width:153px" />
					</TD>
				</TR>
				<TR>
					<TD>
						��ְʱ��(��ʼ)
					</TD>
					<TD>
						<s:textfield name="blg0208" />
					</TD>
					<TD>
						��ְʱ��(����)
					</TD>
					<TD>
						<s:textfield name="elg0208" />
					</TD>
				</TR>
				<!-- �������� -->
				<s:if test="rows!=null">
					<TR>
						<TD colspan="100">
							<table border="1" width="100%">
								<tr>
									<td>
										���
									</td>
									<td>
										Ա�����
									</td>
									<td>
										Ա������
									</td>
									<td>
										Ա������
									</td>
									<td>
										Ա��״̬
									</td>
									<td>
										��ְʱ��
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
											<s:property value="lg2102" />
										</td>
										<td>
											<s:property value="lg0202" />
										</td>
										<td>
											<s:property value="cnlg0402" />
										</td>
										<td>
											<s:property value="cnlg0207" />
										</td>
										<td>
											<s:property value="lg0208" />
										</td>
										<td>
											<a href="#" onclick="onEdit(<s:property value="pas001"/>)">�༭</a>
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
				<TD colspan="100">
				<s:property value="msg"/>
				</TD>
				</TR>
				</s:else>
				<!-- ��ť -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="��ѯ" name="next" />
						<s:submit value="���" name="next2" />
					</TD>
				</TR>

			</TABLE>
		</s:form>
	</body>
</html>
