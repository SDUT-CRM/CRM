package cn.sdut.web.b1.impl;

import java.util.List;

import cn.sdut.web.b1.B1020Support;

public class B1023Action extends B1020Support {

	@Override
	public String execute() throws Exception {
		boolean res = this.getB1020Services().setOk();
		if (res == true) {
			this.msg = "ȡ���ɹ�!";
		} else {
			this.msg = "ȡ��ʧ��!";
		}
		List rows = this.getB1020Services().query1();
		if (rows.size() > 0) {
			this.rows = rows;
		} else {
			this.msg = "û�з�������������!";
		}
		return "main";
	}
}
