package cn.sdut.web.a1.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.system.Tools;
import cn.sdut.web.a1.A1030Support;

public class A1031Action extends A1030Support {

	@Override
	public String execute() throws Exception {
		try {
			boolean res = this.getA1030Services().add();
			if (res == true) {
				this.msg = "ÃÌº”≥…π¶";
			} else {
				this.msg = "ÃÌº” ß∞‹";
			}
			this.oclg1701 = Tools.getOptions("LG1701");
		} catch (Exception e) {
			this.msg = "Õ¯¬Áπ ’œ";
			e.printStackTrace();
		}
		return "main";
	}

}
