package cn.sdut.web.a1.impl;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.system.Tools;
import cn.sdut.web.a1.A1030Support;

public class A1033Action extends A1030Support {

	@Override
	public String execute() throws Exception {
		try {
			Map ins = this.getA1030Services().getInstance();
			if (ins != null) {
				BeanUtils.populate(this, ins);
			} else {
				this.msg = "该数据不存在!";
			}
			this.oclg1701 = Tools.getOptions("LG1701");
		} catch (Exception e) {
			this.msg = "网络故障!";
			e.printStackTrace();
		}
		return "main";
	}

}
