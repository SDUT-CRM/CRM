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
		<s:form action="c4041Action">
			<TABLE border="1" align="center" width="1000px">
				<caption>
					��Ӫ״����ѯ����
					<hr width="320">
				</caption>
				<TR>
					<TD>
						��ʼʱ��
					</TD>
					<TD>
						<s:textfield name="begintime" />
					</TD>
				</TR>
				<TR>
					<TD>
						����ʱ��
					</TD>
					<TD>
						<s:textfield name="endtime" />
					</TD>
				</TR>
				<TR>
					<TD colspan="100" align="center">
						<img alt="" src="<%=path%>/c4040Action.action">
					</TD>
				</TR>
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
