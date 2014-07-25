<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
	<script type="text/javascript" src="<%=path%>/js/calendar.js"></script>
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
	    	action="<%=path%>/c2022Action.action?type="+obj;
	    }
	}
	
	function onNext3(obj)
	{
	    with(document.forms[0])
	    {
	    	action="<%=path%>/c2022Action.action?type="+obj;
	    }
	}
	
	function onEdit(obj1,obj4)
	{
		with(document.forms[0])
	    {
	    	action="<%=path%>/c2023Action.action?"
	    	+"lg1401="+obj1
	    	+"&lg1406="+obj4
	    	;
	    	submit();
	    }
	}
	</script>
	</head>
	<body>
		<s:form action="c2020Action">
			<TABLE border="1" align="center" width="1000px">
				<caption>
					配件信息管理界面
					<hr width="320">
				</caption>
				<TR>
					<TD>
						配件编号
					</TD>
					<TD>
						<s:textfield name="qlg1302" />
					</TD>
					<TD>
						配件名称
					</TD>
					<TD>
						<s:textfield name="qlg1303" />
					</TD>
				</TR>
				<TR>
					<TD>
						申领部门
					</TD>
					<TD>
						<s:select name="qlg0402" list="oclg0402" listKey="key"
							listValue="value" headerKey="" headerValue="==不限=="
							cssStyle="width:153px" />
					</TD>
					<TD>
						申领人
					</TD>
					<TD>
						<s:textfield name="qlg0202" />
					</TD>
				</TR>
				<TR>
					<TD>
						审核状态
					</TD>
					<TD>
						<s:select name="qlg1403" list="oclg1403" listKey="key"
							listValue="value" headerKey="" headerValue="==不限=="
							cssStyle="width:153px" />
					</TD>
					<TD>
						经手人
					</TD>
					<TD>
						<s:textfield name="qlg0302" />
					</TD>
				</TR>
				<TR>
					<TD>
						申请开始时间
					</TD>
					<TD>
						<s:textfield name="blg1402" onclick="calendar.show(this);" />
					</TD>
					<TD>
						申请结束时间
					</TD>
					<TD>
						<s:textfield name="elg1402" onclick="calendar.show(this);" />
					</TD>
				</TR>
				<TR>
					<TD>
						审核开始时间
					</TD>
					<TD>
						<s:textfield name="blg1404" onclick="calendar.show(this);" />
					</TD>
					<TD>
						审核结束时间
					</TD>
					<TD>
						<s:textfield name="elg1404" onclick="calendar.show(this);" />
					</TD>
				</TR>
				<TR>
					<TD>
						领取开始时间
					</TD>
					<TD>
						<s:textfield name="blg1405" onclick="calendar.show(this);" />
					</TD>
					<TD>
						领取结束时间
					</TD>
					<TD>
						<s:textfield name="elg1405" onclick="calendar.show(this);" />
					</TD>
				</TR>
				<!-- 迭代数据 -->
				<s:if test="rows!=null">
					<TR>
						<TD colspan="100">
							<table border="1" width="100%">
								<tr>
									<td>
										&nbsp;
									</td>
									<td>
										序号
									</td>
									<td>
										配件编号
									</td>
									<td>
										配件名称
									</td>
									<td>
										申请数量
									</td>
									<td>
										领取部门
									</td>
									<td>
										领取人编号
									</td>
									<td>
										领取人姓名
									</td>
									<td>
										审核状态
									</td>
									<td>
										经办人姓名
									</td>
									<td>
										申请时间
									</td>
									<td>
										审核时间
									</td>
									<td>
										领取时间
									</td>
									<td>
										&nbsp;
									</td>
								</tr>
								<s:iterator value="rows" status="st">
									<tr>
										<td>
										<s:if test="lg1403==1">
											<input type="checkbox" name="parsList" 
												onclick="onSelect(this.checked)" 
												value="<s:property value="lg1401"/>" >
									    </s:if>
									    <s:else>
									    &nbsp;&nbsp;
									    </s:else>
										</td>
										<td>
											<s:property value="#st.count" />
										</td>
										<td>
											<s:property value="lg1302" />
										</td>
										<td>
											<s:property value="lg1303" />
										</td>
										<td>
											<s:property value="lg1406" />
										</td>
										<td>
											<s:property value="cnlg0402" />
										</td>
										<td>
											<s:property value="lg2102" />
										</td>
										<td>
											<s:property value="lg0202" />
										</td>
										<td>
											<s:property value="cnlg1403" />
										</td>
										<td>
											<s:property value="lg0302" />
										</td>
										<td>
											<s:property value="lg1402" />
										</td>
										<td>
										<s:if test="lg1403!=1">
										<s:property value="lg1404" />
										</s:if>
											
										</td>
										<td>
										<s:if test="lg1403==3">
											<s:property value="lg1405" />
									    </s:if>
										</td>
										<td>
											<a href="#" 
											onclick="onEdit(
											'<s:property value="lg1401" />',
											'<s:property value="lg1406" />'
											)"
											>修改</a>
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
							<s:property value="msg" />
						</TD>
					</TR>
				</s:else>
				<!-- 按钮 -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="查询" name="next" />
						<s:submit value="通过" name="next" onclick="return onNext2('2')" disabled="true"/>
						<s:submit value="拒绝" name="next" onclick="return onNext3('4')" disabled="true"/>
					</TD>
				</TR>
			</TABLE>
			<input type="hidden" name="parsList">
		</s:form>
	</body>
</html>
