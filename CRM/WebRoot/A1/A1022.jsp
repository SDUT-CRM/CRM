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
			action="<%=path%>/a1021Action.action?path=a&lg0701="+obj;
			submit();
		}
	}
	function onCancel(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/a1024Action.action?lg0801="+obj;
			submit();
		}
	}
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1024Action">
       <center>�鿴��μ�����</center>
    <hr width="160">  
<s:if test="rows!=null">   
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
		   <td align="center">���</td>
           <td align="center">�����</td>
           <td align="center">��������</td>
           <td align="center">�����</td>
           <td align="center">�״̬</td>
           <td>&nbsp;</td>
           <td>&nbsp;</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="lg0702"/></td>
	           <td align="center"><s:property value="lg0802"/></td>
	           <td align="center"><s:property value="lg0708"/></td>
	           <td align="center"><s:property value="cnlg0804"/></td>
	           <td align="center">
	           	   <a href="#" onclick="onSelect(<s:property value="lg0701"/>)">�鿴����</a>
	           </td>
	            <td align="center">
	            <s:if test="lg0804==1">
	               <a href="#" onclick="onCancel(<s:property value="lg0801"/>)">ȡ���μ�</a>
	            </s:if>
				<s:else>
					��ȡ��
				</s:else>	            
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
