<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
  
  	function onNext3()
  	{
  		with(document.forms[0]) 
  		{
  			action="/adminMenu.jsp";
  		}
  	}
  
  	function onNext4()
  	{
  		with(document.forms[0]) 
  		{
  		action="<%=path%>/d1012Action.action";
  		submit();
  		}
  	}
  
  	function onAdd()
  	{
  		with(document.forms[0]) 
  		{
  			action="<%=path%>/D1/D1011.jsp";
  		}
  	}
  	</script>
  	<!-- CSS goes in the document HEAD or added to your external stylesheet -->
		<style type="text/css">
table.altrowstable {
	font-family: verdana, arial, sans-serif;
	font-size: 11px;
	color: #333333;
	border-width: 1px;
	border-color: #a9c6c9;
	border-collapse: collapse;
}

table.altrowstable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}

table.altrowstable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}

.oddrowcolor {
	background-color: #d4e3e5;
}

.evenrowcolor {
	background-color: #c3dde0;
}
</style>
	</head>
	<body>
		<s:property value="msg" />
		<br>
		<br>
		<s:form action="d1010Action">
			<TABLE border="1" width="80%" align="center">
				<caption>
					��Ա����
				<hr width="160">
				</caption>
				<!-- ���ݵ��� -->
				<s:if test="rows!=null">
					<TR>
						<TD>
							<table border="1" width="100%" class="altrowstable" id="alternatecolor">
								<tr>
									<td>
										&nbsp;
									</td>
									<td>
										&nbsp;
									</td>
									<td>
										���
									</td>
									<td>
										����
									</td>
									<td>
										���
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
												onclick="onInfo(<s:property value='lg2101'/>,<s:property value='lg2105'/>)">�鿴����</a>
										</td>
										<td>
											<a href="#"
												onclick="onUpdate(<s:property value='lg2101'/>,<s:property value='lg2105'/>)">�޸�</a>
										</td>
									</tr>
								</s:iterator>
							</table>
							${requestScope.pageinfo }
						</TD>
					</TR>
				</s:if>
				<TR>
					<!-- ��ť���� -->
					<TD align="center">
						<s:submit name="next" value = "��ѯ��Ա" />
						<s:submit name="next" value = "���" onclick ="return onAdd()" />
						<s:submit name="next" value = "���� " onclick ="return onNext3()" />
						<s:submit name="next" value = "ɾ��" onclick ="return onNext4()" disabled="true" />
						
					</TD>
				</TR>
			</TABLE>
			<input type="hidden" name="parsList" value="">
		</s:form>
	</body>
</html>
