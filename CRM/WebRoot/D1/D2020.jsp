<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<html>
<head>
<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
	<title>My JSP 'D2020.jsp' starting page</title>
	<script type="text/javascript">
	  function onSelect() {
	  	with(document.forms[0]) {
	  		next[1].disabled=false;
	  	}
	  }
	
	  function onInfo(obj) {
	  	with(document.forms[0]) {
	  		action="<%=path%>/D1/d2024Action.action?lg0501="+obj;
	  		submit();
	  	}
	  }
	  
	  function onUpdate(obj) {
	  	with(document.forms[0]) {
	  		action="<%=path%>/D1/d20232Action.action?lg0501="+obj;
	  		submit();
	  	}
	  }
	  
	   function onDelete() {
  		 with(document.forms[0]) {
  		 	action="<%=path%>/d2022Action.action";
  			submit();
  	}
  }
  
  function onAdd() {
  	with(document.forms[0]) {
  		action="<%=path%>/D1/D2021.jsp";
  	}
  }
  
  function onNext() {
  	with(document.forms[0]) {
  		action="/adminMenu.jsp";
  	}
  }
	</script>
	<script type="text/javascript">
function altRows(id){
	if(document.getElementsByTagName){  
		
		var table = document.getElementById(id);  
		var rows = table.getElementsByTagName("tr"); 
		 
		for(i = 0; i < rows.length; i++){          
			if(i % 2 == 0){
				rows[i].className = "evenrowcolor";
			}else{
				rows[i].className = "oddrowcolor";
			}      
		}
	}
}

window.onload=function(){
	altRows('alternatecolor');
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
<s:property value="msg"/>
<br>
<br>
<s:form action="d2020Action">
<TABLE border="1" width="80%" align="center">
<caption>
业务管理
<hr width="160">
</caption>
<!-- 数据迭代 -->
<s:if test="rows!=null">
	<TR>
	
		<TD>
			<table border="1" width="100%" class="altrowstable" id="alternatecolor">
				<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>业务编号</td>
				<td>名称</td>
				<td>业务状态</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				</tr>
				<s:iterator value="rows" status="st">
					<tr>
						<td>
							<input type="radio" name="parsList"
		 			               onclick="onSelect()" value="<s:property value="lg0501"/>">		
						</td>
						<td><s:property value="#st.count"/></td>
						<td><s:property value="lg0502"/></td>
						<td><s:property value="lg0503"/></td>
						<td><s:property value="cnlg0509"/></td>
						<td>
							<a href="#" onclick="onInfo(<s:property value="lg0501"/>)">查看详情</a>
						</td>
						<td>
							<a href="#" onclick="onUpdate(<s:property value="lg0501"/>)">修改</a>
						</td>
					</tr>
				</s:iterator>
			</table>
			 ${requestScope.pageinfo }
		</TD>
	</TR>
</s:if>
	<TR>
	<!-- 按钮 -->
		<TD colspan="100" align="center">
		<s:submit name="next" value="添加业务" onclick="return onAdd()"/>
		<s:submit name="next" value="停办业务" onclick="return onDelete()" disabled="true"/>
		<s:submit name="next" value="返回" onclick="return onNext()"/>
		</TD>
	</TR>
</TABLE>
 <input type="hidden" name="parsList" value="">
 <s:hidden name="lg0501"/>
</s:form>
</body>
</html>
