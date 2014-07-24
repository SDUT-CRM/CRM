package cn.sdut.web.b1.impl;

import java.util.List;

import cn.sdut.web.b1.B1020Support;

public class B1021Action extends B1020Support {

	@Override
	public String execute() throws Exception {
		boolean res = this.getB1020Services().setOk();
		if (res == true) {
			this.msg = "审核成功!";
		} else {
			this.msg = "审核成功!";
		}
		List rows = this.getB1020Services().query();
		if (rows.size() > 0) {
			this.rows = rows;
		} else {
			this.msg = "没有符合条件的数据!";
		}
		return "main";
	}
}
