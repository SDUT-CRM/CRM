<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<html>
<head>
 <link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
	<title>My JSP 'A1032.jsp' starting page</title>
	<script type="text/javascript">
	function onNext()
    {
    	with(document.forms[0])
    	{
    		action="<%=path%>/a1034Action.action";
    	}
    }
	function onNext1()
    {
    	with(document.forms[0])
    	{
    		action="<%=path%>/a1032Action.action";
    	}
    }
    function onSelect()
    {
    	with(document.forms[1])
    	{
    		next.disabled=false;
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
<s:form action="a1034Action">
 <TABLE border="1" width="80%" align="center">
   <caption>
        查看报修
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table width="100%">
         <tr>
           <td width="25%">故障类别</td>
           <td width="25%">
             <s:select name="lg1701" list="oclg1701"
                listKey="key" listValue="value" cssStyle="width:153px"
                />
             </td>
         </tr>
         <tr>
           <td>故障描述</td>
           <td>
            <s:textarea name="lg1805" rows="20" cssStyle="width:300px"/>
           </td>
         </tr>
       </table>
     </TD>
   </TR>
   <TR>
     <TD align="center">
     <s:if test="lg1804==1">
       <s:submit name="next" value="修改" />
     </s:if>
       <s:submit name="next" value="返回" onclick="return onNext1()"/>
     </TD>
   </TR>
 </TABLE>
 <s:hidden name="lg2101" value="%{#session.USERINFO.lg2101}"/>
 <s:hidden name="lg1801"/>
 <s:hidden name="qlg1804"/>
 <s:hidden name="qlg1701"/>
 <s:hidden name="bqlg1802"/>
 <s:hidden name="eqlg1802"/>
</s:form>
<s:if test="lg1804==3">
<s:form action="a1036Action" class="altrowstable" id="alternatecolor">
<TABLE border="1" width="80%" align="center">
   <caption>
        请对我们的服务进行评价
    <hr width="160"> 
    </caption>
    <tr>
       <td>评价等级</td>
          <td>
            <s:radio name = "lg1902"  onclick="onSelect()" list="#{'1':'一星','2':'二星','3':'三星','4':'四星','5':'五星'}" />
           </td>
     </tr> 
   </TABLE>
   <center>
   <s:submit name="next" value="确认评价" disabled="true"/>
   </center>
   <s:hidden name="lg0201"/>
   <s:hidden name="lg2101"/>
   <s:hidden name="lg1801"/>
   
</s:form>
</s:if>

</body>
</html>
