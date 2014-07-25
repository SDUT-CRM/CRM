<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<html>
<head>
<link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
	<title>My JSP 'A1032.jsp' starting page</title>
	<script type="text/javascript">
	function onNext()
    {
    	with(document.forms[0])
    	{
    		action="<%=path%>/b1024Action.action";
    	}
    }
	</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="b1026Action">
 <TABLE border="1" width="80%" align="center">
   <caption>
        查看问题详情
    <hr width="160">  
   </caption>
   <TR>
     <TD>
     <s:if test="rows!=null"> 
       <table border="1" width="100%">
   			  
         <s:iterator value="rows" status="st">
	         <tr>
	           <td nowrap="nowrap">问题:</td>
	           <td nowrap="nowrap"><s:property value="lg2002"/></td>
	           <td nowrap="nowrap"><s:property value="lg2004"/></td>
	         </tr>
	         <tr>
	           <td>回答:</td>
	           <td><s:property value="lg2003"/></td>
	           <td><s:property value="lg2005"/></td>
	         </tr>
	          <s:if test="#st.count == rows.size() && lg2003==null || lg2003 == '' &&lg2007==1">
	           <tr>
           		<td>回答</td>
           		<td>
           		 <s:textarea name="lg2003" value="" rows="3" cssStyle="width:820px"/>
          		 </td>
           		<td>
           		<s:hidden name="lg0101"/>
 				<s:hidden name="lg0201"/>
 				<s:hidden name="lg2006"/>
 				<s:hidden name="lg2001"/>
           		 <s:submit name="next" value="回答"/>
           		</td>
         		</tr>

	          </s:if>
         </s:iterator>
       ${requestScope.pageinfo }
       </table>
   </s:if>
 </TABLE>
 <center>
<s:submit name="next1" value="返回 " onclick="return onNext()"/> 
 </center>

   <s:hidden name="lg2001"/>
   <s:hidden name="lg2101"/>
   <s:hidden name="qlg2002"/>
   <s:hidden name="qlg2003"/>
   <s:hidden name="qlg2007"/>
   <s:hidden name="bqlg2004"/>
   <s:hidden name="eqlg2004"/>
</s:form>

</body>
</html>
