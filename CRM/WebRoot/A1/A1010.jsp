<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
</head>
<body>
<s:property value="msg"/>
<s:if test="rows!=null">   
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td>���</td>
           <td>ҵ������</td>
           <td>ҵ��۸�</td>
           <td>�������</td>
           <td>ҵ��״̬</td>
           <td>&nbsp;</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	           <td><s:property value="#st.count"/></td>
	           <td><s:property value="lg0503"/></td>
	           <td><s:property value="lg0506"/></td>
	           <td><s:property value="lg0507"/></td>
	           <td><s:property value="cnlg0509"/></td>
	            <td>
	              <a href="#" onclick="onSelect(<s:property value="lg0501"/>)">�鿴����</a>
	            </td>
	         </tr>
         </s:iterator>
       </table>
       ${requestScope.pageinfo }
     </TD>
   </TR>
   </s:if>
	</body>
</html>
