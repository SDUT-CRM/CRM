<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
<script type="text/javascript">
	function onNext()
    {
    	with(document.forms[0])
    	{
    		action="<%=path%>/a1012Action.action";
    	}
    }
    function onNext1()
    {
    	with(document.forms[0])
    	{
    		action="<%=path%>/a1013Action.action";
    	}
    }
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1010Action">
 <table border="1" align="center" width="40%">
   <caption>
      ҵ������
     <hr width="160">
   </caption>
    <tr>
     <td>ҵ����</td>
     <td>
       <s:textfield name="lg0502" readonly="true"/>
     </td>
   </tr>
   <tr>
     <td>ҵ������</td>
     <td>
       <s:textfield name="lg0503" readonly="true"/>
     </td>
   </tr>
   <tr>
     <td>ҵ������</td>
     <td>
       <s:textfield name="lg0504" readonly="true"/>
     </td>
   </tr>
      <tr>
     <td>ҵ���ʷ�</td>
     <td>
       <s:textfield name="lg0506" readonly="true"/>
     </td>
   </tr>
      <tr>
     <td>�������</td>
     <td>
       <s:textfield name="lg0507" readonly="true"/>
     </td>
   </tr>
  <tr>
      <td colspan="100" align="center">
      	<s:if test="msg==null">
      		<s:submit name="next" value="����" onclick="return onNext()"/>
      	</s:if>
      	<s:if test="path!=null">
        <s:submit name="next" value="���� " onclick="return onNext1()"/>
        </s:if>
        <s:else>
        <s:submit name="next" value="���� "/>
        </s:else>
      </td>
    </tr>
 </table>
  <s:hidden name="qlg0503"/>
 <s:hidden name="qlg0602"/>
 <s:hidden name="bqlg0603"/>
 <s:hidden name="eqlg0603"/>
 <s:hidden name="bqlg0604"/>
 <s:hidden name="eqlg0604"/>
 <s:hidden name="lg0501"/>
 <s:hidden name="lg2101" value="2"/>
</s:form>
	</body>
</html>
