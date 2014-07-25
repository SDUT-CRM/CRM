package cn.sdut.web.d1.impl;

import cn.sdut.web.d1.D2020Support;

public class D2021Action extends D2020Support {

	@Override
	public String execute() throws Exception {

		try{
			this.msg=this.d2020Services.add()?"数据添加成功！":"数据添加失败";
		}
		catch (Exception e) {
			this.msg="网络故障";
			e.printStackTrace();
		}
		return "main";
	}
}
