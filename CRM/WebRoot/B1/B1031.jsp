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
    		action="<%=path%>/b1032Action.action";
    	}
    }
    function onNext1()
    {
    	with(document.forms[0])
    	{
    		action="<%=path%>/b1030Action.action";
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
      ��������
     <hr width="160">
   </caption>
    <tr>
     <td>�������</td>
     <td>
       <s:textfield name="cnlg1701" readonly="true"/>
     </td>
   </tr>
   <tr>
     <td>�ͻ�����</td>
     <td>
       <s:textfield name="lg0102" readonly="true"/>
     </td>
   </tr>
   <tr>
     <td>�ͻ��ֻ���</td>
     <td>
       <s:textfield name="lg0105" readonly="true"/>
     </td>
   </tr>
      <tr>
     <td>�ͻ���ַ</td>
     <td>
       <s:textarea rows="3" name="lg0104" readonly="true"/>
     </td>
   </tr>
      <tr>
     <td>��������</td>
     <td>
       <s:textarea rows="7" name="lg1805" readonly="true"/>
     </td>
   </tr>
  <tr>
      <td colspan="100" align="center">
      <s:if test="msg==null || msg==''">
      	<s:submit name="next" value="����" onclick="return onNext()"/>
      </s:if>
        <s:submit name="next" value="���� " onclick="return onNext1()"/>
      </td>
    </tr>
 </table>
  <s:hidden name="lg1801"/>
 <s:hidden name="qlg1701"/>
 <s:hidden name="bqlg1802"/>
 <s:hidden name="eqlg1802"/>
 <s:hidden name="lg0201" value="%{#session.USERINFO.lg2101}"/>
</s:form>
	</body>
</html>
