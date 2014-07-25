<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
  <script type="text/javascript" src="<%=request.getContextPath()%>/js/calendar.js"></script>
<script type="text/javascript">
 	var count=0;
    function onSelect(obj)
    {
    	with(document.forms[0])
    	{
    	   obj?++count:--count;
    	   next[1].disabled=(count==0);
    	   next[2].disabled=(count==0);
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
	function  onNext2(obj)
    {
    	with(document.forms[0])
    	{
    		action="<%=path%>/b1021Action.action?lg0602="+obj;
    	}
    }
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="b1020Action">
<TABLE border="1" width="80%" align="center">
   <caption>
        业务申请审核
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td width="25%">业务名称</td>
           <td width="25%">
             <s:textfield name="qlg0503"/>
           </td>
           <td>申请日期</td>
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
           <td align="center">序号</td>
           <td align="center">业务编号</td>
           <td align="center">业务名称</td>
           <td align="center">客户姓名</td>
           <td align="center">业务资费</td>
           <td align="center">申请日期</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	          <td>
	         <input type="checkbox" name="parsList"
	                onclick="onSelect(this.checked)"  value="<s:property value="lg0601"/>">
	       </td>
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="lg0502"/></td>
	           <td align="center"><s:property value="lg0503"/></td>
	           <td align="center"><s:property value="lg0102"/></td>
	           <td align="center"><s:property value="lg0506"/></td>
	           <td align="center"><s:property value="lg0603"/></td>
	         </tr>
         </s:iterator>
       </table>
       ${requestScope.pageinfo }
     </TD>
   </TR>
   </s:if>
    <s:hidden name="lg0201" value="%{#session.USERINFO.lg2101}"/>
    <s:hidden name="parsList" value=""/>
       <TR>
     <TD align="center">
       <s:submit  name="next" value="查询"/>
       <s:submit name="next" value="审核通过" onclick="return onNext2('2')" disabled="true"/>
       <s:submit name="next" value="审核不通过" onclick="return onNext2('3')" disabled="true"/>
     </TD>
   </TR>
 </TABLE>
   </s:form>
	</body>
</html>
