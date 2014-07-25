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
    		action="<%=path%>/a1022Action.action";
    	}
    }
    function onNext1()
    {
    	with(document.forms[0])
    	{
    		action="<%=path%>/a1023Action.action";
    	}
    }
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1020Action">
 <table border="1" align="center" width="40%">
   <caption>
      活动详情
     <hr width="160">
   </caption>
    <tr>
     <td>活动名称</td>
     <td>
       <s:textfield name="lg0702" readonly="true"/>
     </td>
   </tr>
   <tr>
     <td>活动详情</td>
     <td>
       <s:textfield name="lg0703" readonly="true"/>
     </td>
   </tr>
      <tr>
     <td>活动日期</td>
     <td>
       <s:textfield name="lg0708" readonly="true"/>
     </td>
   </tr>
      <tr>
     <td>添加日期</td>
     <td>
       <s:textfield name="lg0709" readonly="true"/>
     </td>
   </tr>
         <tr>
     <td>剩余名额</td>
     <td>
       <s:textfield name="lg0705" readonly="true"/>
     </td>
   </tr>
         <tr>
     <td>活动状态</td>
     <td>
       <s:textfield name="cnlg0707" readonly="true"/>
     </td>
   </tr>
  <tr>
      <td colspan="100" align="center">
      	<s:if test="msg==null">
      		<s:submit name="next" value="参加" onclick="return onNext()"/>
      	</s:if>
      	<s:if test="path!=null">
        <s:submit name="next" value="返回 " onclick="return onNext1()"/>
        </s:if>
        <s:else>
        <s:submit name="next" value="返回 "/>
        </s:else>
      </td>
    </tr>
 </table>
  <s:hidden name="qlg0702"/>
 <s:hidden name="qlg0804"/>
 <s:hidden name="bqlg0708"/>
 <s:hidden name="eqlg0708"/>
 <s:hidden name="bqlg0802"/>
 <s:hidden name="eqlg0802"/>
 <s:hidden name="lg0701"/>
  <s:hidden name="lg0707"/>
 <s:hidden name="lg2101" value="%{#session.USERINFO.lg2101}"/>
</s:form>
	</body>
</html>
