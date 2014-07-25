<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
  <script type="text/javascript" src="<%=request.getContextPath()%>/js/calendar.js"></script>
<script type="text/javascript">
	function onCancel(obj1)
	{
		with(document.forms[0])
		{
			action="<%=path%>/b1043Action.action?lg1301="+obj1;
			submit();
		}
	}
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="b1041Action">
<TABLE border="1" width="80%" align="center">
   <caption>
        配件申请
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td width="25%">配件编号</td>
           <td width="25%">
             <s:textfield name="qlg1302"/>
           </td>
        
           <td width="25%">配件名称</td>
           <td width="25%">
             <s:textfield name="qlg1303"/>
           </td>
        
           </tr>
           </table>
     </TD>
   </TR>
<s:if test="rows!=null">   
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td align="center">序号</td>
           <td align="center">配件编号</td>
           <td align="center">配件名称</td>
           <td align="center">剩余数量</td>
           <td align="center">申请数量</td>
        	 <td>&nbsp;</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="lg1302"/></td>
	           <td align="center"><s:property value="lg1303"/></td>
	           <td align="center"><s:property value="lg1305"/></td>
	           <s:if test="lg1305>0">
	           <td align="center"><s:textfield name="lg1406" /></td>
	           </s:if>
	           <s:else>
	           <td align="center">-</td>
	           </s:else>
	           <td align="center"><a href="#" onclick="onCancel(<s:property value="lg1301"/>)">确认申领</a></td>
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
