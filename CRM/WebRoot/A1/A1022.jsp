<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
 <link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
  <script type="text/javascript" src="<%=request.getContextPath()%>/js/calendar.js"></script>
<script type="text/javascript">
   	function onSelect(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/a1021Action.action?path=a&lg0701="+obj;
			submit();
		}
	}
	function onCancel(obj1, obj2)
	{
		with(document.forms[0])
		{
			action="<%=path%>/a1024Action.action?lg0801="+obj1+"&lg0701="+obj2;
			submit();
		}
	}
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1023Action">
<TABLE border="1" width="80%" align="center">
   <caption>
        �鿴��μ�����
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td width="25%">�����</td>
           <td width="25%">
             <s:textfield name="qlg0702"/>
           </td>
           <td width="25%">����״̬</td>
           <td width="25%">
             <s:select name="qlg0804" list="oclg0804"
                listKey="key" listValue="value"
                headerKey="" headerValue="==����=="
                cssStyle="width:153px"
                />
             </td>
         </tr>
         <tr>
           <td>�����</td>
           <td colspan="200">
            <s:textfield name="bqlg0708" onclick="calendar.show(this);" readonly="true"/>
           	- <s:textfield name="eqlg0708" onclick="calendar.show(this);" readonly="true"/>
           </td>
         </tr>
         <tr>
           <td>��������</td>
           <td colspan="200">
            <s:textfield name="bqlg0802" onclick="calendar.show(this);" readonly="true"/>
           	- <s:textfield name="eqlg0802" onclick="calendar.show(this);" readonly="true"/>
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
	               <a href="#" onclick="onCancel(<s:property value="lg0801"/>,<s:property value="lg0701"/>)">ȡ���μ�</a>
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
    <s:hidden name="lg2101" value="%{#session.USERINFO.lg2101}"/>
   <TR>
     <TD align="center">
       <s:submit  name="next" value="��ѯ"/>
     </TD>
   </TR>
 </TABLE>
   </s:form>
	</body>
</html>
