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
			action="<%=path%>/b1034Action.action?lg1801="+obj;
			submit();
		}
	}
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="b1033Action">
<TABLE border="1" width="80%" align="center">
   <caption>
        我的受理记录
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
           <td width="25%">故障类别</td>
 			<td width="25%">
             <s:select name="qlg1701" list="oclg1701"
                listKey="key" listValue="value"
                headerKey="" headerValue="==不限=="
                cssStyle="width:153px"
                />
             </td>
              <td width="25%">报修状态</td>
             <td width="25%">
             <s:select name="qlg1804" list="ocllg18"
                listKey="key" listValue="value"
                headerKey="" headerValue="==不限=="
                cssStyle="width:153px"
                />
             </td>
            <tr>
           <td>报修日期</td>
           <td colspan="200">
            <s:textfield name="bqlg1802" onclick="calendar.show(this);" readonly="true"/>
           	- <s:textfield name="eqlg1802" onclick="calendar.show(this);" readonly="true"/>
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
           <td align="center">故障类型</td>
           <td align="center">客户姓名</td>
           <td align="center">联系方式</td>
           <td align="center">报修日期</td>
           <td align="center">报修状态</td>
           <td>&nbsp;</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="cnlg1701"/></td>
	           <td align="center"><s:property value="lg0102"/></td>
	           <td align="center"><s:property value="lg0105"/></td>
	           <td align="center"><s:property value="lg1802"/></td>
	           <td align="center"><s:property value="cnlg1804"/></td>
	           <s:if test="lg1804==2">
	           <td align="center">
	           	   <a href="#" onclick="onSelect(<s:property value="lg1801"/>)">标记完成</a>
	           </td>
	           </s:if>
	           <s:else>
	            <td align="center">
	            -
	           	</td>
	           </s:else>
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
     </TD>
   </TR>
 </TABLE>
   </s:form>
	</body>
</html>
