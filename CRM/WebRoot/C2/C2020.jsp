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
					�����Ϣ�������
					<hr width="320">
				</caption>
				<TR>
					<TD>
						������
					</TD>
					<TD>
						<s:textfield name="qlg1302" />
					</TD>
					<TD>
						�������
					</TD>
					<TD>
						<s:textfield name="qlg1303" />
					</TD>
				</TR>
				<TR>
					<TD>
						���첿��
					</TD>
					<TD>
						<s:select name="qlg0402" list="oclg0402" listKey="key"
							listValue="value" headerKey="" headerValue="==����=="
							cssStyle="width:153px" />
					</TD>
					<TD>
						������
					</TD>
					<TD>
						<s:textfield name="qlg0202" />
					</TD>
				</TR>
				<TR>
					<TD>
						���״̬
					</TD>
					<TD>
						<s:select name="qlg1403" list="oclg1403" listKey="key"
							listValue="value" headerKey="" headerValue="==����=="
							cssStyle="width:153px" />
					</TD>
					<TD>
						������
					</TD>
					<TD>
						<s:textfield name="qlg0302" />
					</TD>
				</TR>
				<TR>
					<TD>
						���뿪ʼʱ��
					</TD>
					<TD>
						<s:textfield name="blg1402" />
					</TD>
					<TD>
						�������ʱ��
					</TD>
					<TD>
						<s:textfield name="elg1402" />
					</TD>
				</TR>
				<TR>
					<TD>
						��˿�ʼʱ��
					</TD>
					<TD>
						<s:textfield name="blg1404" />
					</TD>
					<TD>
						��˽���ʱ��
					</TD>
					<TD>
						<s:textfield name="elg1404" />
					</TD>
				</TR>
				<TR>
					<TD>
						��ȡ��ʼʱ��
					</TD>
					<TD>
						<s:textfield name="blg1405" />
					</TD>
					<TD>
						��ȡ����ʱ��
					</TD>
					<TD>
						<s:textfield name="elg1405" />
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
						<s:submit value="���" name="next2" onclick="return onNext2()" />
					</TD>
				</TR>
			</TABLE>
		</s:form>
	</body>
</html>
