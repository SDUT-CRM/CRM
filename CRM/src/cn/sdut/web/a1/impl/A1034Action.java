package cn.sdut.web.a1.impl;

import cn.sdut.system.Tools;
import cn.sdut.web.a1.A1030Support;

public class A1034Action extends A1030Support {

	@Override
	public String execute() throws Exception {
		try {
			this.msg = this.getA1030Services().modify() ? "���³ɹ�!" : "����ʧ��";
		} catch (Exception e) {
			this.msg = "�������!";
			e.printStackTrace();
		}
		this.oclg1701 = Tools.getOptions("LG1701");
		return "main";
	}
}
