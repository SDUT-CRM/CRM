package cn.sdut.web.d1.impl;

import cn.sdut.web.d1.D3030Support;

public class D3031Action extends D3030Support {

	@Override
	public String execute() throws Exception {

		try{
			this.msg=this.d3030Services.add()?"�����ӳɹ�":"������ʧ��";
			
		}
		catch (Exception e) {
			this.msg="�������";
			e.printStackTrace();
		}
		return "main";
	}

}
