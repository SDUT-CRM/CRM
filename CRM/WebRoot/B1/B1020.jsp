<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
  <script type="text/javascript" src="<%=request.getContextPath()%>/js/calendar.js"></script>
<script type="text/javascript">
	function onSelect(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/a1011Action.action?path=a&lg0501="+obj;
			submit();
		}
	}
	function onCancel(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/a1014Action.action?lg0601="+obj;
			submit();
		}
	}
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1013Action">
<TABLE border="1" width="80%" align="center">
   <caption>
        ҵ���������
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td width="25%">ҵ������</td>
           <td width="25%">
             <s:textfield name="qlg0503"/>
           </td>
           <td>��������</td>
           <td colspan="200">
            <s:textfield name="bqlg0603" onclick="calendar.show(this);" readonly="true"/>
           	- <s:textfield name="eqlg0603" onclick="calendar.show(this);" readonly="true"/>
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
         	<td>&nbsp;</td>
           <td align="center">���</td>
           <td align="center">ҵ����</td>
           <td align="center">ҵ������</td>
           <td align="center">�ͻ�����</td>
           <td align="center">ҵ���ʷ�</td>
           <td align="center">��������</td>
           <td>&nbsp;</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	           <td>&nbsp;</td>
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="lg0502"/></td>
	           <td align="center"><s:property value="lg0503"/></td>
	           <td align="center"><s:property value="lg0102"/></td>
	           <td align="center"><s:property value="lg0506"/></td>
	           <td align="center"><s:property value="lg0603"/></td>
	           <td align="center">
	           	<s:if test="lg0602==1">
	           		<a href="#" onclick="onCancel(<s:property value="lg0601"/>)">���ͨ��</a>
	           	</s:if>
	     		<s:else>
	     			����ȡ��
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
       <TR>
     <TD align="center">
       <s:submit  name="next" value="��ѯ"/>
     </TD>
   </TR>
 </TABLE>
   </s:form>
	</body>
</html>
