<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<html>
	<head>
	<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
		<title>My JSP 'D1010.jsp' starting page</title>
		<script type="text/javascript">
  function onSelect()
  {
   with(document.forms[0]) 
   {
     next[3].disabled=false;
   }
  }
  
  function onInfo(obj1,obj2)
   {
  with(document.forms[0])
  {
  	action="<%=path%>/d1014Action.action?lg2101="+obj1+"&lg2105="+obj2;
  	submit();
  	}
  }
  
  function onUpdate(obj1,obj2) 
  {
  	with(document.forms[0]) 
  	{
  		action="<%=path%>/d1013Action.action?lg2101="+obj1+"&lg2105="+obj2;
  		submit();
  	}
  }
  
  function onNext3() {
  	with(document.forms[0]) {
  		action="/adminMenu.jsp";
  	}
  }
  
  function onNext4() {
  	with(document.forms[0]) {
  		action="<%=path%>/d1012Action.action";
  		submit();
  	}
  }
  
  function onAdd() {
  	with(document.forms[0]) {
  		action="<%=path%>/D1/D1011.jsp";
  	}
  }
  </script>
	</head>
	<body>
		<s:property value="msg" />
		<br>
		<br>
		<s:form action="d1010Action">
			<TABLE border="1" width="80%" align="center">
				<caption>
					人员管理
					<hr width="160">
				</caption>

				<!-- 数据迭代 -->
				<s:if test="rows!=null">
					<TR>
						<TD>
							<table border="1" width="100%">
								<tr>
									<td>
										&nbsp;
									</td>
									<td>
										&nbsp;
									</td>
									<td>
										编号
									</td>
									<td>
										姓名
									</td>
									<td>
										类别
									</td>
									<td>
										&nbsp;
									</td>
									<td>
										&nbsp;
									</td>
								</tr>
								<s:iterator value="rows" status="st">
									<tr>
										<td>
											<input type="radio" name="parsList" onclick="onSelect()"
												value="<s:property value="lg2101"/>">
										</td>
										<td>
											<s:property value="#st.count" />
										</td>
										<td>
											<s:property value="lg2102" />
										</td>
										<td>
											<s:property value="lg2104" />
										</td>
										<td>
											<s:property value="cnlg2105" />
										</td>
										<td>
											<a href="#"
												onclick="onInfo(<s:property value='lg2101'/>,<s:property value='lg2105'/>)">查看详情</a>
										</td>
										<td>
											<a href="#"
												onclick="onUpdate(<s:property value='lg2101'/>,<s:property value='lg2105'/>)">修改</a>
										</td>
									</tr>
								</s:iterator>
							</table>
							${requestScope.pageinfo }
						</TD>
					</TR>
				</s:if>
				<TR>
					<!-- 按钮操作 -->
					<TD align="center">
						<s:submit name="next" value = "查询人员" />
						<s:submit name="next" value = "添加" onclick ="return onAdd()" />
						<s:submit name="next" value = "返回 " onclick ="return onNext3()" />
						<s:submit name="next" value = "删除" onclick ="return onNext4()"
							disabled="true" />
					</TD>
				</TR>
			</TABLE>
			<input type="hidden" name="parsList" value="">
		</s:form>
	</body>
</html>
