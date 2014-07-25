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
    	with(document.forms[1])
    	{
    		action="<%=path%>/a1041Action.action";
    	}
    }
	function onNext1()
    {
    	with(document.forms[0])
    	{
    		action="<%=path%>/a1032Action.action";
    	}
    }
    function onSelect()
    {
    	with(document.forms[1])
    	{
    		next.disabled=false;
    	}
    }
	</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1043Action">
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
	          <s:if test="#st.count == rows.size() && lg2003!=null && lg2003 != '' &&lg2007==1">
	           <tr>
           		<td>追加问题</td>
           		<td>
           		 <s:textarea name="lg2002" value="" rows="3" cssStyle="width:820px"/>
          		 </td>
           		<td>

           		 <s:submit  name="next" value="追加"/>
           		</td>
         		</tr>

	          </s:if>
         </s:iterator>
       ${requestScope.pageinfo }
       </table>
   </s:if>
 </TABLE>
           		<s:hidden name="lg0101"/>
 				<s:hidden name="lg0201"/>
 				<s:hidden name="lg2006"/>
 				<s:hidden name="lg2007"/>
 				<s:hidden name="lg2001"/>
</s:form>

<s:form action="a1044Action">
<s:if test="lg2007==1">
<TABLE border="1" width="80%" align="center">
   <caption>
        如果回答已经解决了您的问题，请对我们的服务进行评价
    <hr width="160"> 
    </caption>
    <tr>
       <td>评价等级</td>
          <td>
            <s:radio name = "lg1902"  onclick="onSelect()" list="#{'1':'一星','2':'二星','3':'三星','4':'四星','5':'五星'}" />
           </td>
     </tr> 
   </TABLE>
   <center>
   <s:submit name="next" value="确认评价" disabled="true"/>
   </s:if>
   <s:else>
   </center>
   <center>
   </s:else>
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
