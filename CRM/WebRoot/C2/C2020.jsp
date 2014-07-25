<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
	<script type="text/javascript" src="<%=path%>/js/calendar.js"></script>
		<script type="text/javascript">
	var count = 0;
	function onSelect(obj) {
		with (document.forms[0]) {
			obj ? ++count : --count;
			next[2].disabled = (count == 0);
			next[1].disabled = (count == 0);
		}
	}
	
	function onNext2(obj)
	{
	    with(document.forms[0])
	    {
	    	action="<%=path%>/c2022Action.action?type="+obj;
	    }
	}
	
	function onNext3(obj)
	{
	    with(document.forms[0])
	    {
	    	action="<%=path%>/c2022Action.action?type="+obj;
	    }
	}
	
	function onEdit(obj1,obj4)
	{
		with(document.forms[0])
	    {
	    	action="<%=path%>/c2023Action.action?"
	    	+"lg1401="+obj1
	    	+"&lg1406="+obj4
	    	;
	    	submit();
	    }
	}
	</script>
	</head>
	<body>
		<s:form action="c2020Action">
			<TABLE border="1" align="center" width="1000px">
				<caption>
					�����Ϣ�������
					<hr width="320">
				</caption>
				<TR>
					<TD>
						������
					</TD>
					<TD>
						<s:textfield name="qlg1302" />
					</TD>
					<TD>
						�������
					</TD>
					<TD>
						<s:textfield name="qlg1303" />
					</TD>
				</TR>
				<TR>
					<TD>
						���첿��
					</TD>
					<TD>
						<s:select name="qlg0402" list="oclg0402" listKey="key"
							listValue="value" headerKey="" headerValue="==����=="
							cssStyle="width:153px" />
					</TD>
					<TD>
						������
					</TD>
					<TD>
						<s:textfield name="qlg0202" />
					</TD>
				</TR>
				<TR>
					<TD>
						���״̬
					</TD>
					<TD>
						<s:select name="qlg1403" list="oclg1403" listKey="key"
							listValue="value" headerKey="" headerValue="==����=="
							cssStyle="width:153px" />
					</TD>
					<TD>
						������
					</TD>
					<TD>
						<s:textfield name="qlg0302" />
					</TD>
				</TR>
				<TR>
					<TD>
						���뿪ʼʱ��
					</TD>
					<TD>
						<s:textfield name="blg1402" onclick="calendar.show(this);" />
					</TD>
					<TD>
						�������ʱ��
					</TD>
					<TD>
						<s:textfield name="elg1402" onclick="calendar.show(this);" />
					</TD>
				</TR>
				<TR>
					<TD>
						��˿�ʼʱ��
					</TD>
					<TD>
						<s:textfield name="blg1404" onclick="calendar.show(this);" />
					</TD>
					<TD>
						��˽���ʱ��
					</TD>
					<TD>
						<s:textfield name="elg1404" onclick="calendar.show(this);" />
					</TD>
				</TR>
				<TR>
					<TD>
						��ȡ��ʼʱ��
					</TD>
					<TD>
						<s:textfield name="blg1405" onclick="calendar.show(this);" />
					</TD>
					<TD>
						��ȡ����ʱ��
					</TD>
					<TD>
						<s:textfield name="elg1405" onclick="calendar.show(this);" />
					</TD>
				</TR>
				<!-- �������� -->
				<s:if test="rows!=null">
					<TR>
						<TD colspan="100">
							<table border="1" width="100%">
								<tr>
									<td>
										&nbsp;
									</td>
									<td>
										���
									</td>
									<td>
										������
									</td>
									<td>
										�������
									</td>
									<td>
										��������
									</td>
									<td>
										��ȡ����
									</td>
									<td>
										��ȡ�˱��
									</td>
									<td>
										��ȡ������
									</td>
									<td>
										���״̬
									</td>
									<td>
										����������
									</td>
									<td>
										����ʱ��
									</td>
									<td>
										���ʱ��
									</td>
									<td>
										��ȡʱ��
									</td>
									<td>
										&nbsp;
									</td>
								</tr>
								<s:iterator value="rows" status="st">
									<tr>
										<td>
										<s:if test="lg1403==1">
											<input type="checkbox" name="parsList" 
												onclick="onSelect(this.checked)" 
												value="<s:property value="lg1401"/>" >
									    </s:if>
									    <s:else>
									    &nbsp;&nbsp;
									    </s:else>
										</td>
										<td>
											<s:property value="#st.count" />
										</td>
										<td>
											<s:property value="lg1302" />
										</td>
										<td>
											<s:property value="lg1303" />
										</td>
										<td>
											<s:property value="lg1406" />
										</td>
										<td>
											<s:property value="cnlg0402" />
										</td>
										<td>
											<s:property value="lg2102" />
										</td>
										<td>
											<s:property value="lg0202" />
										</td>
										<td>
											<s:property value="cnlg1403" />
										</td>
										<td>
											<s:property value="lg0302" />
										</td>
										<td>
											<s:property value="lg1402" />
										</td>
										<td>
										<s:if test="lg1403!=1">
										<s:property value="lg1404" />
										</s:if>
											
										</td>
										<td>
										<s:if test="lg1403==3">
											<s:property value="lg1405" />
									    </s:if>
										</td>
										<td>
											<a href="#" 
											onclick="onEdit(
											'<s:property value="lg1401" />',
											'<s:property value="lg1406" />'
											)"
											>�޸�</a>
										</td>
									</tr>
								</s:iterator>
							</table>
							${requestScope.pageinfo }
						</TD>
					</TR>
				</s:if>
				<s:else>
					<TR>
						<TD colspan="100">
							<s:property value="msg" />
						</TD>
					</TR>
				</s:else>
				<!-- ��ť -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="��ѯ" name="next" />
						<s:submit value="ͨ��" name="next" onclick="return onNext2('2')" disabled="true"/>
						<s:submit value="�ܾ�" name="next" onclick="return onNext3('4')" disabled="true"/>
					</TD>
				</TR>
			</TABLE>
			<input type="hidden" name="parsList">
		</s:form>
	</body>
</html>
