<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
	<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
		<script type="text/javascript">
		function onSelect()
		{
			with(document.forms[0])
			{
				next[0].disable=false;
			}
		}
		function onNext()
		{
			with(document.forms[0])
			{
				action="<%=path%>/c2020Action.action";
			}
		}
		</script>
	</head>
	<body>
	<s:property value="msg"/>
		<s:form action="c2024Action">
		
			<TABLE border="1" align="center" width="1000px">
				<caption>
					审核状态修改页面
					<hr width="300px">
				</caption>
				<TR>
					<TD>申请流水号</TD>
					<TD><s:textfield name="lg1401" readonly="true"/></TD>
				</TR>
				<TR>
					<TD>申请数量</TD>
					<TD><s:textfield name="lg1406" readonly="true"/></TD>
				</TR>
				<TR>
					<TD>修改后的状态</TD>
					<TD>
					<s:select name="lg1403" list="oclg1403" listKey="key"
							listValue="value"  cssStyle="width:153px"
							onclick="onSelect()" 
							/>
					</TD>
				</TR>
				<TR>
					<TD align="center" colspan="100">
					<s:submit name="next" value="确认修改"/>
					<s:submit name="next" value="返回" onclick="onNext()"/>
					</TD>
				</TR>
			</TABLE>
			<s:hidden name="qlg1302"/>
			<s:hidden name="qlg1303"/>
			<s:hidden name="qlg0402"/>
			<s:hidden name="qlg0202"/>
			<s:hidden name="qlg1403"/>
			<s:hidden name="qlg0302"/>
			<s:hidden name="blg1402"/>
			<s:hidden name="elg1402"/>
			<s:hidden name="blg1404"/>
			<s:hidden name="elg1404"/>
			<s:hidden name="blg1405"/>
			<s:hidden name="elg1405"/>
		</s:form>
	</body>
</html>
