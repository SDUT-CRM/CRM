package cn.sdut.web.d1.impl;

import cn.sdut.web.d1.D1010Support;

public class D1011Action extends D1010Support {

	@Override
	public String execute() throws Exception {

		try{
			this.msg=this.d1010Services.addMs()?"��ӳɹ�":"���ʧ��";
		}
		catch (Exception e) {
			this.msg="�������";
			e.printStackTrace();
		}
		return "main";
	}

}
