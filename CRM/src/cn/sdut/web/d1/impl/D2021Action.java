package cn.sdut.web.d1.impl;

import cn.sdut.web.d1.D2020Support;

public class D2021Action extends D2020Support {

	@Override
	public String execute() throws Exception {

		try{
			this.msg=this.d2020Services.add()?"������ӳɹ���":"�������ʧ��";
		}
		catch (Exception e) {
			this.msg="�������";
			e.printStackTrace();
		}
		return "main";
	}
}
