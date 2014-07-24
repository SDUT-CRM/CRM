<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
  <script type="text/javascript" src="<%=request.getContextPath()%>/js/calendar.js"></script>
<script type="text/javascript">
   	function onSelect(obj, obj1)
	{
		with(document.forms[0])
		{
			action="<%=path%>/a1042Action.action?lg2007="+obj1+"&lg2001="+obj;
			submit();
		}
	}
	function onCancel(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/a1035Action.action?lg1801="+obj;
			submit();
		}
	}
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1041Action">
<TABLE border="1" width="80%" align="center">
   <caption>
        我的提问记录
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table border="1" width="100%">
           <tr>
			<td width="25%">问题关键字</td>
           <td width="25%">
             <s:textfield name="qlg2002"/>
           </td>
           <td width="25%">回复关键字</td>
           <td width="25%">
             <s:textfield name="qlg2003"/>
           </td>
         </tr>
         <tr>
           <td>提问时间</td>
           <td colspan="200">
            <s:textfield name="bqlg2004" onclick="calendar.show(this);" readonly="true"/>
           	- <s:textfield name="eqlg2004" onclick="calendar.show(this);" readonly="true"/>
           </td>
         </tr>
         <tr>
			<td width="25%">提问状态</td>
           <td width="25%">
             <s:select name="qlg2007" list="oclg2007"
                listKey="key" listValue="value"
                headerKey="" headerValue="==不限=="
                cssStyle="width:153px"
                />
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
           <td align="center">提问问题</td>
           <td align="center">提问时间</td>
           <td align="center">状态</td>
           <td>&nbsp;</td>
           <td>&nbsp;</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="lg2002"/></td>
	           <td align="center"><s:property value="lg2004"/></td>
	           <td align="center"><s:property value="cnlg2007"/></td>
	           <td align="center">
	           	   <a href="#" onclick="onSelect(<s:property value="lg2001"/>, <s:property value="lg2007"/>)">查看</a>
	           </td>
	            <td align="center">
	            <s:if test="lg2007==1">
	               <a href="#" onclick="onCancel(<s:property value="lg1801"/>)">删除</a>
	            </s:if>
	          	<s:elseif test="lg2007==3">
	          		已删除
	          	</s:elseif>
				<s:else>
					不可删除
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
       <s:submit  name="next" value="查询"/>
     </TD>
   </TR>
 </TABLE>
   </s:form>
	</body>
</html>
