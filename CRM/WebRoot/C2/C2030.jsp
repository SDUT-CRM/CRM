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
		<s:property value="msg" />
		<s:debug />
		<s:form action="c2024Action">

			<TABLE border="1" align="center" width="1000px">
				<caption>
					�����Ϣ����ҳ��
					<hr width="300px">
				</caption>
				<TR>
					<TD>
						������
					</TD>
					<TD>
						<s:textfield name="qlg1302" readonly="true" />
					</TD>
				</TR>
				<TR>
					<TD>
						��������
					</TD>
					<TD>
						<s:textfield name="qlg1303" disabled="true" />
					</TD>
				</TR>
				<s:if test="rows!=null">
					<TR>
						<TD colspan="100">
							<table width="100%" border="1">
							
								<tr>
									<td>���</td>
									<td>������</td>
									<td>�������</td>
									<td>����۸�</td>
									<td>�������</td>
									<td>&nbsp;</td>
								</tr>
								<s:iterator value="rows" status="st">
								<tr>
									<td><s:property value="#st.count" /></td>
									<td><s:property value="lg1302" /></td>
									<td><s:property value="lg1303" /></td>
									<td><s:property value="lg1304" /></td>
									<td><s:property value="lg1305" /></td>
									<td><s:property value="lg1306" /></td>
									<td><a href="#">�޸�</a></td>
								</tr>
								</s:iterator>
							</table>
						</TD>
					</TR>
				</s:if>
			</TABLE>
			<s:hidden name="qlg1302" />
			<s:hidden name="qlg1303" />
			<s:hidden name="qlg0402" />
			<s:hidden name="qlg0202" />
			<s:hidden name="qlg1403" />
			<s:hidden name="qlg0302" />
			<s:hidden name="blg1402" />
			<s:hidden name="elg1402" />
			<s:hidden name="blg1404" />
			<s:hidden name="elg1404" />
			<s:hidden name="blg1405" />
			<s:hidden name="elg1405" />
		</s:form>
	</body>
</html>
