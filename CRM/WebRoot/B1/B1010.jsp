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
		<s:form action="b1011Action">
			<TABLE border="1" align="center" width="850px">
				<caption>
					添加客户界面
					<hr width="320">
				</caption>
				<TR>
					<TD>
						客户账号
					</TD>
					<TD>
						<s:textfield name="lg2102" />
					</TD></TR>
				<TR>
					<TD>
						客户姓名
					</TD>
					<TD>
						<s:textfield name="lg0102" />
					</TD>
				</TR>
				<TR>
					<TD>
						客户身份证号码
					</TD>
					<TD>
						<s:textfield name="lg0103" />
					</TD>
			   </TR>
			   <TR>
					<TD>
						客户地址
					</TD>
					<TD>
						<s:textfield name="lg0104" />
					</TD>
			   </TR>
			   <TR>
					<TD>
						客户手机号码
					</TD>
					<TD>
						<s:textfield name="qlg0105" />
					</TD>
				</TR>
				 <TR>
					<TD>
						客户地址
					</TD>
					<TD>
						<s:textfield name="qlg0106" />
					</TD>
				</TR>
				
				<!-- 按钮 -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="确认添加" name="next" />
						<s:submit value="返回" name="next2" onclick="return onNext2()" />
					</TD>
				</TR>
			</TABLE>
		</s:form>
	</body>
</html>
