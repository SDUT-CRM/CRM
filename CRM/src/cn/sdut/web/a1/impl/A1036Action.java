package cn.sdut.web.a1.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.system.Tools;
import cn.sdut.web.a1.A1031Support;

import com.opensymphony.xwork2.ActionContext;

public class A1036Action extends A1031Support {

	@Override
	public String execute() throws Exception {
		try {
			boolean res = this.getA1031Services().add();
			if (res == true) {
				this.msg = "∆¿º€≥…π¶";
			} else {
				this.msg = "∆¿º€ ß∞‹";
			}
		} catch (Exception e) {
			this.msg = "Õ¯¬Áπ ’œ";
			e.printStackTrace();
		}
		this.oclg1701 = Tools.getOptions("LG1701");
		return "main";
	}

}
