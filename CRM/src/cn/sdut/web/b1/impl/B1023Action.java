package cn.sdut.web.b1.impl;

import java.util.List;

import cn.sdut.web.b1.B1020Support;

public class B1023Action extends B1020Support {

	@Override
	public String execute() throws Exception {
		boolean res = this.getB1020Services().setOk();
		if (res == true) {
			this.msg = "取消成功!";
		} else {
			this.msg = "取消失败!";
		}
		List rows = this.getB1020Services().query1();
		if (rows.size() > 0) {
			this.rows = rows;
		} else {
			this.msg = "没有符合条件的数据!";
		}
		return "main";
	}
}
