package cn.sdut.web.a1.impl;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.web.a1.A1010Support;

public class A1011Action extends A1010Support {

	@Override
	public String execute() throws Exception {
		try {
			Map ins = this.getA1010Services().getInstance();
			if (ins != null) {
				if(ins.get("lg0509").toString().equals("2")){
					this.msg = "提示：该业务已停止办理!";
				}
				if(this.getA1010Services().check()==false){
					System.out.println("checked");
					this.msg = "提示：您已办理该业务!";
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
