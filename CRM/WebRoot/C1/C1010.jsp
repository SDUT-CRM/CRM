<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
	</head>
	<body>
		<TABLE border="1" align="center" width="850px">
		<caption>
		Ա����Ϣ�������
		<hr width="320">
		</caption>
			<TR>
				<TD>Ա�����</TD>
				<TD>
				<s:textfield name="lg2102"/>
				</TD>
				<TD>Ա������</TD>
				<TD>
				<select>
				<option value="a">������</option>				
				</select>
				</TD>
			</TR>
			<TR>
			<TD>Ա������</TD>
			<TD><s:textfield name="lg0202"/></TD>
			<TD>Ա��״̬</TD>
			<TD>
			<select>
				<option value="1">��ְ</option>				
				<option value="2">��ְ</option>				
				<option value="3">����</option>				
				</select>
			</TD>
			</TR>
			<TR>
				<TD>��ְʱ��(��ʼ)</TD>
				<TD><s:textfield name="blg0208"/></TD>
				<TD>��ְʱ��(����)</TD>
				<TD><s:textfield name="elg0208"/></TD>
			</TR>
			<!-- �������� -->
			<TR>
			</TR>
			<!-- ��ť -->
			<TR>
				<TD colspan="100" align="center">
					<s:submit value="��ѯ" name="next"/>
					<s:submit value="���" name="next2"/>
				</TD>
			</TR>
			
		</TABLE>
	</body>
</html>
