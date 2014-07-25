package cn.sdut.web.d1.impl;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.web.d1.D1010Support;

public class D1014Action extends D1010Support {

	@Override
	public String execute() throws Exception {

		try{
			Map ins=this.getD1014Services().getInstance();
			System.out.println(ins);
			if(ins!=null){
				BeanUtils.populate(this, ins);			
			}
			else{
				this.msg="该数据不存在!";
			}
		}
		catch (Exception e) {

			this.msg="网络故障!";
			e.printStackTrace();
		}
		return "main";
	}

}
