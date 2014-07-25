<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
 <link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
<script type="text/javascript">
	function onNext()
    {
    	with(document.forms[0])
    	{
    		action="<%=path%>/a1012Action.action";
    	}
    }
    function onNext1()
    {
    	with(document.forms[0])
    	{
    		action="<%=path%>/a1013Action.action";
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
<s:form action="a1010Action">
 <table border="1" align="center" width="40%" class="altrowstable" id="alternatecolor">
   <caption>
      业务详情
     <hr width="160">
   </caption>
    <tr>
     <td>业务编号</td>
     <td>
       <s:textfield name="lg0502" readonly="true"/>
     </td>
   </tr>
   <tr>
     <td>业务名称</td>
     <td>
       <s:textfield name="lg0503" readonly="true"/>
     </td>
   </tr>
   <tr>
     <td>业务详情</td>
     <td>
       <s:textfield name="lg0504" readonly="true"/>
     </td>
   </tr>
      <tr>
     <td>业务资费</td>
     <td>
       <s:textfield name="lg0506" readonly="true"/>
     </td>
   </tr>
      <tr>
     <td>添加日期</td>
     <td>
       <s:textfield name="lg0507" readonly="true"/>
     </td>
   </tr>
  <tr>
      <td colspan="100" align="center">
      	<s:if test="msg==null">
      		<s:submit name="next" value="申请" onclick="return onNext()"/>
      	</s:if>
      	<s:if test="path!=null">
        <s:submit name="next" value="返回 " onclick="return onNext1()"/>
        </s:if>
        <s:else>
        <s:submit name="next" value="返回 "/>
        </s:else>
      </td>
    </tr>
 </table>
  <s:hidden name="qlg0503"/>
 <s:hidden name="qlg0602"/>
 <s:hidden name="bqlg0603"/>
 <s:hidden name="eqlg0603"/>
 <s:hidden name="bqlg0604"/>
 <s:hidden name="eqlg0604"/>
 <s:hidden name="lg0501"/>
 <s:hidden name="lg2101" value="%{#session.USERINFO.lg2101}"/>
</s:form>
	</body>
</html>
