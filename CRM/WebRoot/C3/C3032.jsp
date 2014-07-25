<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
	<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
	<script type="text/javascript" src="<%=path%>/js/calendar.js"></script>
		<script type="text/javascript">
	var count = 0;
	function onSelect(obj) {
		with (document.forms[0]) {
			obj ? ++count : --count;
			next[0].disabled = (count == 0);
		}
	}
	function onNext(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/c3041Action.action?type="+obj;
		}
	}
	function onNext2()
	{
		with(document.forms[0])
		{
			action="<%=path%>/c3031Action.action";
		}
	}
</script>
	</head>
	<body>
	<s:property value="msg"/>
		<s:form action="c3033Action">
			<TABLE border="1" align="center" width="1000px">
				<caption>
					活动添加界面
					<hr width="320">
				</caption>
				<TR>
					<TD>活动名称</TD>
					<TD><s:textfield name="lg0702"/></TD>
				</TR>
				<TR>
					<TD>活动内容</TD>
					<TD><s:textfield name="lg0703"/></TD>
				</TR>
				<TR>
					<TD>预算</TD>
					<TD><s:textfield name="lg0704"/></TD>
				</TR>
				<TR>
					<TD>人数</TD>
					<TD><s:textfield name="lg0705"/></TD>
				</TR>
				<TR>
					<TD>报名截止时间</TD>
					<TD><s:textfield name="lg0706" onclick="calendar.show(this);"/></TD>
				</TR>
				<TR>
					<TD>活动日期</TD>
					<TD><s:textfield name="lg0708" onclick="calendar.show(this);"/></TD>
				</TR>
				<!-- 按钮 -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="确认" name="next" />
						<s:submit value="返回" name="next" onclick="return onNext2()" />
					</TD>
				</TR>
			</TABLE>
			<input type="hidden" name="parsList">
			<s:hidden name="lg0701" />
			<s:hidden name="qlg0702" />
			<s:hidden name="qlg0703" />
			<s:hidden name="qlg0302" />
			<s:hidden name="qlg0707" />
			<s:hidden name="blg0706" />
			<s:hidden name="elg0706" />
			<s:hidden name="blg0708" />
			<s:hidden name="elg0708" />
		</s:form>
	</body>
</html>
