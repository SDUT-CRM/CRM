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
	function onCancel(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/b1042Action.action?lg1401="+obj;
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
       <table border="1" width="100%" class="altrowstable" id="alternatecolor">
         <tr>
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
	           <td align="center"><s:property value="#st.count"/></td>
	           <td align="center"><s:property value="lg1302"/></td>
	           <td align="center"><s:property value="lg1303"/></td>
	           <td align="center"><s:property value="lg1406"/></td>
	           <td align="center"><s:property value="lg1402"/></td>
	           <s:if test="lg1403!=1">
	           <td align="center"><s:property value="lg1404"/></td>
	           </s:if>
	           <s:else>
	           <td align="center">-</td>
	           </s:else>
	            <td align="center"><s:property value="cnlg1403"/></td>
	           <s:if test="lg1403==2">
	           <td align="center"><a href="#" onclick="onCancel(<s:property value="lg1401"/>)">确认领取</a></td>
	           </s:if>
	           <s:else>
	           <td>&nbsp;</td>
	           </s:else>
	         </tr>
         </s:iterator>
       </table>
       ${requestScope.pageinfo }
     </TD>
   </TR>
   </s:if>
    <s:hidden name="lg0201" value="%{#session.USERINFO.lg2101}"/>
       <TR>
     <TD align="center">
       <s:submit  name="next" value="查询"/>
     </TD>
   </TR>
 </TABLE>
   </s:form>
	</body>
</html>
