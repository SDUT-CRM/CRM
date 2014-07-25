package cn.sdut.web.d1.impl;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.web.d1.D3030Support;

public class D3033Action extends D3030Support {

	@Override
	public String execute() throws Exception {


		try {
			System.out.println(this.lg1301);
			Map ins=this.getD3030Services().getInstance();
			System.out.println(ins);
			if(ins!=null) {
				BeanUtils.populate(this, ins);
			}
			else {
				this.msg="没有符合条件的数据!";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return "main";
	}

}
