package cn.sdut.web.d1.impl;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.web.d1.D2020Support;

public class D2024Action extends D2020Support {

	@Override
	public String execute() throws Exception {

		try{
			Map ins=this.getD2020Services().getInstance();
			if(ins!=null) {
				BeanUtils.populate(this, ins);
			}
			else{
				this.msg="û�и�����!";
			}
		}
		catch (Exception e) {
			this.msg="�������";
			e.printStackTrace();

		}
		return "main";
	}

}
