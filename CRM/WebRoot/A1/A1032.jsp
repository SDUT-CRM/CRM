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
<s:form action="a1034Action">
 <TABLE border="1" width="80%" align="center">
   <caption>
        �鿴����
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td width="25%">�������</td>
           <td width="25%">
             <s:select name="lg1701" list="oclg1701"
                listKey="key" listValue="value" cssStyle="width:153px"
                />
             </td>
         </tr>
         <tr>
           <td>��������</td>
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
       <s:submit name="next" value="�޸�" />
     </s:if>
       <s:submit name="next" value="����" onclick="return onNext1()"/>
     </TD>
   </TR>
 </TABLE>
 <s:hidden name="lg2101" value="%{#session.USERINFO.lg2101}"/>
 <s:hidden name="lg1801"/>
 <s:hidden name="qlg1804"/>
 <s:hidden name="qlg1701"/>
 <s:hidden name="bqlg1802"/>
 <s:hidden name="eqlg1802"/>
</s:form>
<s:if test="lg1804==3">
<s:form action="a1036Action">
<TABLE border="1" width="80%" align="center">
   <caption>
        ������ǵķ����������
    <hr width="160"> 
    </caption>
    <tr>
       <td>���۵ȼ�</td>
          <td>
            <s:radio name = "lg1902"  onclick="onSelect()" list="#{'1':'һ��','2':'����','3':'����','4':'����','5':'����'}" />
           </td>
     </tr> 
   </TABLE>
   <center>
   <s:submit name="next" value="ȷ������" disabled="true"/>
   </center>
   <s:hidden name="lg0201"/>
   <s:hidden name="lg2101"/>
   <s:hidden name="lg1801"/>
   
</s:form>
</s:if>

</body>
</html>
