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
<TABLE border="1" width="80%" align="center">
   <caption>
        查看活动
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td width="25%">活动名称</td>
           <td width="25%">
             <s:textfield name="qlg0702"/>
           </td>
           <td width="25%">活动状态</td>
           <td width="25%">
             <s:select name="qlg0707" list="oclg0707"
                listKey="key" listValue="value"
                headerKey="" headerValue="==不限=="
                cssStyle="width:153px"
                />
             </td>
         </tr>
         <tr>
           <td>活动日期</td>
           <td colspan="200">
            <s:textfield name="blg0708" onclick="calendar.show(this);" readonly="true"/>
           	- <s:textfield name="elg0708" onclick="calendar.show(this);" readonly="true"/>
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
           <td align="center">序号</td>
           <td align="center">活动名称</td>
           <td align="center">添加日期</td>
           <td align="center">活动日期</td>
           <td align="center">剩余名额</td>
           <td align="center">活动状态</td>
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
	              <a href="#" onclick="onSelect(<s:property value="lg0701"/>)">查看详情</a>
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
       <s:submit  name="next" value="查询"/>
     </TD>
   </TR>
 </TABLE>
   </s:form>
	</body>
</html>
