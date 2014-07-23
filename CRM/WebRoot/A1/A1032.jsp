<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<html>
<head>
	<title>My JSP 'A1032.jsp' starting page</title>
	<script type="text/javascript">
	function onNext()
    {
    	with(document.forms[0])
    	{
    		action="<%=path%>/a1034Action.action";
    	}
    }
	function onNext1()
    {
    	with(document.forms[0])
    	{
    		action="<%=path%>/a1032Action.action";
    	}
    }
	</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1034Action">
 <TABLE border="1" width="80%" align="center">
   <caption>
        查看报修
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td width="25%">故障类别</td>
           <td width="25%">
             <s:select name="lg1701" list="oclg1701"
                listKey="key" listValue="value" cssStyle="width:153px"
                />
             </td>
         </tr>
         <tr>
           <td>故障描述</td>
           <td>
            <s:textarea name="lg1805" rows="20" cssStyle="width:300px"/>
           </td>
         </tr>
       </table>
     </TD>
   </TR>
   <TR>
     <TD align="center">
     <s:if test="lg1804==1">
       <s:submit name="next" value="修改" />
     </s:if>
       <s:submit name="next" value="返回" onclick="return onNext1()"/>
     </TD>
   </TR>
 </TABLE>
 <s:hidden name="lg2101" value="2"/>
 <s:hidden name="lg1801"/>
</s:form>
</body>
</html>
