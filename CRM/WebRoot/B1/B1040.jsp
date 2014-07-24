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
<s:form action="b1040Action">
<TABLE border="1" width="80%" align="center">
   <caption>
        配件申请记录
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td width="25%">配件名称</td>
           <td width="25%">
             <s:textfield name="qlg1303"/>
           </td>
            <td width="25%">申领状态</td>
           <td width="25%">
             <s:select name="qlg1403" list="oclg1403"
                listKey="key" listValue="value"
                headerKey="" headerValue="==不限=="
                cssStyle="width:153px"
                />
             </td>
           </tr>
           <tr>
           <td>申领日期</td>
           <td colspan="200">
            <s:textfield name="blg1402" onclick="calendar.show(this);" readonly="true"/>
           	- <s:textfield name="elg1402" onclick="calendar.show(this);" readonly="true"/>
           </td>
         </tr>
         <tr>
           <td>审核日期</td>
           <td colspan="200">
            <s:textfield name="blg1404" onclick="calendar.show(this);" readonly="true"/>
           	- <s:textfield name="elg1404" onclick="calendar.show(this);" readonly="true"/>
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
           <td align="center">配件编号</td>
           <td align="center">配件名称</td>
           <td align="center">申请数量</td>
           <td align="center">申请时间</td>
           <td align="center">审核日期</td>
           <td align="center">审核状态</td>
        	 <td>&nbsp;</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	         <td>&nbsp;</td>
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="lg1302"/></td>
	           <td align="center"><s:property value="lg1303"/></td>
	           <td align="center"><s:property value="lg1406"/></td>
	           <td align="center"><s:property value="lg1402"/></td>
	           <td align="center"><s:property value="cnlg1403"/></td>
	           <s:if test="lg1403!=1">
	           <td align="center"><s:property value="lg1404"/></td>
	           </s:if>
	           <s:else>
	           <td align="center">-</td>
	           </s:else>
	           <td>&nbsp;</td>
	         </tr>
         </s:iterator>
       </table>
       ${requestScope.pageinfo }
     </TD>
   </TR>
   </s:if>
    <s:hidden name="lg0201" value="4"/>
       <TR>
     <TD align="center">
       <s:submit  name="next" value="查询"/>
     </TD>
   </TR>
 </TABLE>
   </s:form>
	</body>
</html>
