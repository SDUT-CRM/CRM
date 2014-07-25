<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<html>
<head>
	<title>My JSP 'A1040.jsp' starting page</title>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1040Action">
 <TABLE border="1" width="80%" align="center">
   <caption>
        在线提问
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td>请简要描述您的问题</td>
           <td>
            <s:textarea name="lg2002" rows="20" cssStyle="width:500px"/>
           </td>
         </tr>
       </table>
     </TD>
   </TR>
   <TR>
     <TD align="center">
       <s:submit name="next" value="提问"/>
     </TD>
   </TR>
 </TABLE>
 <s:hidden name="lg2101" value="%{#session.USERINFO.lg2101}"/>
</s:form>
</body>
</html>
