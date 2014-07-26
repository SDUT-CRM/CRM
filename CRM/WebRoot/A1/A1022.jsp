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
			action="<%=path%>/a1021Action.action?path=a&lg0701="+obj;
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
		<script type="text/javascript">
function altRows(id){
	if(document.getElementsByTagName){  
		
		var table = document.getElementById(id);  
		var rows = table.getElementsByTagName("tr"); 
		 
		for(i = 0; i < rows.length; i++){          
			if(i % 2 == 0){
				rows[i].className = "evenrowcolor";
			}else{
				rows[i].className = "oddrowcolor";
			}      
		}
	}
}

window.onload=function(){
	altRows('alternatecolor');
}
</script>


		<!-- CSS goes in the document HEAD or added to your external stylesheet -->
		<style type="text/css">
table.altrowstable {
	font-family: verdana, arial, sans-serif;
	font-size: 11px;
	color: #333333;
	border-width: 1px;
	border-color: #a9c6c9;
	border-collapse: collapse;
}

table.altrowstable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}

table.altrowstable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}

.oddrowcolor {
	background-color: #d4e3e5;
}

.evenrowcolor {
	background-color: #c3dde0;
}
</style>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1023Action">
<TABLE border="1" width="80%" align="center">
   <caption>
        查看活动参加详情
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table width="100%">
         <tr>
           <td width="25%">活动名称</td>
           <td width="25%">
             <s:textfield name="qlg0702"/>
           </td>
           <td width="25%">报名状态</td>
           <td width="25%">
             <s:select name="qlg0804" list="oclg0804"
                listKey="key" listValue="value"
                headerKey="" headerValue="==不限=="
                cssStyle="width:153px"
                />
             </td>
         </tr>
         <tr>
           <td>活动日期</td>
           <td colspan="200">
            <s:textfield name="bqlg0708" onclick="calendar.show(this);" readonly="true"/>
           	- <s:textfield name="eqlg0708" onclick="calendar.show(this);" readonly="true"/>
           </td>
         </tr>
         <tr>
           <td>报名日期</td>
           <td colspan="200">
            <s:textfield name="bqlg0802" onclick="calendar.show(this);" readonly="true"/>
           	- <s:textfield name="eqlg0802" onclick="calendar.show(this);" readonly="true"/>
           </td>
         </tr>
       </table>
     </TD>
   </TR> 
<s:if test="rows!=null">   
   <TR>
     <TD>
       <table width="100%" class="altrowstable" id="alternatecolor">
         <tr>
		   <td align="center">序号</td>
           <td align="center">活动名称</td>
           <td align="center">报名日期</td>
           <td align="center">活动日期</td>
           <td align="center">活动状态</td>
           <td>&nbsp;</td>
           <td>&nbsp;</td>
         </tr>
         <s:iterator value="rows" status="st">
	         <tr>
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="lg0702"/></td>
	           <td align="center"><s:property value="lg0802"/></td>
	           <td align="center"><s:property value="lg0708"/></td>
	           <td align="center"><s:property value="cnlg0804"/></td>
	           <td align="center">
	           	   <a href="#" onclick="onSelect(<s:property value="lg0701"/>)">查看详情</a>
	           </td>
	            <td align="center">
	            <s:if test="lg0804==1">
	               <a href="#" onclick="onCancel(<s:property value="lg0801"/>,<s:property value="lg0701"/>)">取消参加</a>
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
