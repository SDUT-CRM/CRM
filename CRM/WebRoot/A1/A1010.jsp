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
 <link href="<%=path%>/css/style.css" type="text/css" rel="stylesheet"/>
</head>
<body>
<s:property value="msg"/>
<br>
<br>
<s:form action="a1010Action">
 <TABLE  border = "1" width="80%" align="center">
   <caption>
        ҵ�����
    <hr width="160">  
   </caption>
   <TR>
     <TD>
       <table width="100%">
         <tr>
           <td width="25%">ҵ������</td>
           <td width="25%">
             <s:textfield name="qlg0503"/>
           </td>
           <td width="25%">ҵ��״̬</td>
           <td width="25%">
             <s:select name="qlg0509" list="oclg0509"
                listKey="key" listValue="value"
                headerKey="" headerValue="==����=="
                cssStyle="width:153px"
                />
             </td>
         </tr>
         <tr>
           <td>�������</td>
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
       <table  width="100%" class="altrowstable" id="alternatecolor">
         <tr>
           <td align="center">���</td>
           <td align="center">ҵ������</td>
           <td align="center">ҵ���ʷ�</td>
           <td align="center">�������</td>
           <td align="center">ҵ��״̬</td>
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
	              <a href="#" onclick="onSelect(<s:property value="lg0501"/>)">�鿴����</a>
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
       <s:submit  name="next" value="��ѯ"/>
     </TD>
   </TR>
 </TABLE>
   </s:form>
   
	</body>
</html>
