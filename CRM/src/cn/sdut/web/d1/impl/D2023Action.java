package cn.sdut.web.d1.impl;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.web.d1.D2020Support;

public class D2023Action extends D2020Support {

	@Override
	public String execute() throws Exception {

		try{
			this.msg=this.d2020Services.update()?"修改成功":"修改失败";
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return "main";
	}
}
