package cn.sdut.web.d1.impl;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.web.d1.D1010Support;

public class D1013Action extends D1010Support {

	@Override
	public String execute() throws Exception {
		
		
			Map ins=this.getD1013Services().getInstance();
			System.out.println(ins);
			if(ins!=null) {
				BeanUtils.populate(this, ins);
			}
			else {
				this.msg="没有符合条件的数据!";
			}
		
		return "main";
		
	}

}
