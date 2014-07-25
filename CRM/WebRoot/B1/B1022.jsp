<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
  <script type="text/javascript" src="<%=request.getContextPath()%>/js/calendar.js"></script>
<script type="text/javascript">
   	function onSelect(obj, obj1)
	{
		with(document.forms[0])
		{
			action="<%=path%>/a1042Action.action?lg2007="+obj1+"&lg2001="+obj;
			submit();
		}
	}
	function onCancel(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/a1035Action.action?lg1801="+obj;
			submit();
		}
	}
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1041Action">
<TABLE border="1" width="80%" align="center">
   <caption>
        查看待回答提问
    <hr width="160">  
   </caption>
<s:if test="rows!=null">   
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
		   <td align="center">序号</td>
           <td align="center">提问问题</td>
           <td align="center">提问时间</td>
           <td>&nbsp;</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="lg2002"/></td>
	           <td align="center"><s:property value="lg2004"/></td>
	           <td align="center">
	           	   <a href="#" onclick="onSelect(<s:property value="lg2001"/>)">查看</a>
	           </td>
	         </tr>
         </s:iterator>
       </table>
       ${requestScope.pageinfo }
     </TD>
   </TR>
   </s:if>
   
    <s:hidden name="lg0201" value="%{#session.USERINFO.lg2101}"/>
   <TR>
     <TD align="center">
       <s:submit  name="next" value="查询"/>
     </TD>
   </TR>
 </TABLE>
   </s:form>
	</body>
</html>
