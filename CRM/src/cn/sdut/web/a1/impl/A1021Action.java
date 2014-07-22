package cn.sdut.web.a1.impl;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.web.a1.A1020Support;

public class A1021Action extends A1020Support {

	@Override
	public String execute() throws Exception {
		try {
			Map ins = this.getA1020Services().getInstance();
			if (ins != null) {
				if(!ins.get("lg0707").toString().equals("1")){
					this.msg = "提示：该活动已停止报名!";
				}
				if(this.getA1020Services().check()==false){
					this.msg = "提示：您已报名该活动!";
				}
				BeanUtils.populate(this, ins);
			} else {
				this.msg = "该数据不存在!";
			}
		} catch (Exception e) {
			this.msg = "网络故障!";
			e.printStackTrace();
		}
		return "main";
	}

}
