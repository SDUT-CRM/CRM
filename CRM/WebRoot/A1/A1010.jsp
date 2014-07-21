<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
<script type="text/javascript">
	function onSelect(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/a1011Action.action?lg0501="+obj;
			submit();
		}
	}
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1010Action">
       <center>查看业务</center>
    <hr width="160">  
<s:if test="rows!=null">   
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td align="center">序号</td>
           <td align="center">业务名称</td>
           <td align="center">业务资费</td>
           <td align="center">添加日期</td>
           <td align="center">业务状态</td>
           <td>&nbsp;</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="lg0503"/></td>
	           <td align="center"><s:property value="lg0506"/></td>
	           <td align="center"><s:property value="lg0507"/></td>
	           <td align="center"><s:property value="cnlg0509"/></td>
	            <td align="center">
	              <a href="#" onclick="onSelect(<s:property value="lg0501"/>)">查看详情</a>
	            </td>
	         </tr>
         </s:iterator>
       </table>
       ${requestScope.pageinfo }
     </TD>
   </TR>
   </s:if>
   </s:form>
	</body>
</html>
