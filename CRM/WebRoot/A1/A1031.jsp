<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
<script type="text/javascript">
   	function onSelect(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/a1033Action.action?path=a&lg1801="+obj;
			submit();
		}
	}
	function onCancel(obj1, obj2)
	{
		with(document.forms[0])
		{
			action="<%=path%>/a1024Action.action?lg0801="+obj1+"&lg0701="+obj2;
			submit();
		}
	}
</script>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1032Action">
       <center>我的报修单</center>
    <hr width="160">  
<s:if test="rows!=null">   
   <TR>
     <TD>
       <table border="1" width="100%">
         <tr>
		   <td align="center">序号</td>
           <td align="center">故障类别</td>
           <td align="center">报修时间</td>
           <td align="center">状态</td>
           <td>&nbsp;</td>
           <td>&nbsp;</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="cnlg1701"/></td>
	           <td align="center"><s:property value="lg1802"/></td>
	           <td align="center"><s:property value="cnlg1804"/></td>
	           <td align="center">
	           	   <a href="#" onclick="onSelect(<s:property value="lg1801"/>)">查看</a>
	           </td>
	            <td align="center">
	            <s:if test="lg1804==1">
	               <a href="#" onclick="onCancel(<s:property value="lg1801"/>)">取消</a>
	            </s:if>
				<s:else>
					已取消
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
   </s:form>
	</body>
</html>
