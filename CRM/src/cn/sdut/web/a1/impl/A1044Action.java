package cn.sdut.web.a1.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.web.a1.A1041Support;

public class A1044Action extends A1041Support {

	@Override
	public String execute() throws Exception {
		try {
			boolean res = this.getA1041Services().add1();
			if (res == true) {
				this.msg = "∆¿º€≥…π¶";
			} else {
				this.msg = "∆¿º€ ß∞‹";
			}
			List rows = this.getA1041Services().queryById();
			this.rows = rows;
			String pageinfo = this.getA1041Services()
					.getPageInfo("a1042Action");
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("pageinfo", pageinfo);
		} catch (Exception e) {
			this.msg = "Õ¯¬Áπ ’œ";
			e.printStackTrace();
		}
		return "main";
	}

}
