<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
  <script type="text/javascript" src="<%=path%>/js/calendar.js"></script>
<script type="text/javascript">
	function onSelect(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/a1011Action.action?lg0501="+obj;
			submit();
		}
	}
</script>
 <link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1010Action">
 <TABLE border="1" width="80%" align="center">
   <caption>
        业务办理
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
           <td width="25%">业务状态</td>
           <td width="25%">
             <s:select name="qlg0509" list="oclg0509"
                listKey="key" listValue="value"
                headerKey="" headerValue="==不限=="
                cssStyle="width:153px"
                />
             </td>
         </tr>
         <tr>
           <td>添加日期</td>
           <td colspan="200">
            <s:textfield name="bqlg0507" onclick="calendar.show(this);" readonly="true"/>
           	- <s:textfield name="eqlg0507" onclick="calendar.show(this);" readonly="true"/>
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
           <td align="center">业务名称</td>
           <td align="center">业务资费</td>
           <td align="center">添加日期</td>
           <td align="center">业务状态</td>
           <td>&nbsp;</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="lg0503"/></td>
	           <td align="center"><s:property value="lg0506"/></td>
	           <td align="center"><s:property value="lg0507"/></td>
	           <td align="center"><s:property value="cnlg0509"/></td>
	            <td align="center">
	              <a href="#" onclick="onSelect(<s:property value="lg0501"/>)">查看详情</a>
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
