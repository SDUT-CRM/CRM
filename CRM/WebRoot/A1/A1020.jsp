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
			action="<%=path%>/a1021Action.action?lg0701="+obj;
			submit();
		}
	}
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1020Action">
       <center>�鿴ҵ��</center>
    <hr width="160">  
<s:if test="rows!=null">   
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td align="center">���</td>
           <td align="center">�����</td>
           <td align="center">�������</td>
           <td align="center">�����</td>
           <td align="center">ʣ������</td>
           <td align="center">�״̬</td>
           <td>&nbsp;</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="lg0702"/></td>
	           <td align="center"><s:property value="lg0709"/></td>
	           <td align="center"><s:property value="lg0708"/></td>
	           <td align="center"><s:property value="lg0705"/></td>
	           <td align="center"><s:property value="cnlg0707"/></td>
	            <td align="center">
	              <a href="#" onclick="onSelect(<s:property value="lg0701"/>)">�鿴����</a>
	            </td>
	         </tr>
         </s:iterator>
       </table>
       ${requestScope.pageinfo }
     </TD>
   </TR>
   </s:if>
    <s:hidden name="lg2101" value="2"/>
   </s:form>
	</body>
</html>
