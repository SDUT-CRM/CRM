package cn.sdut.web.a1.impl;

import cn.sdut.services.A1011Services;
import cn.sdut.system.Tools;

public class A1012Action {
	
	protected A1011Services a1011Services = null;
	protected String msg = null;

	public String execute() throws Exception{
		a1011Services.setMapDto(Tools.describe());
		System.out.println("111");
		boolean res = a1011Services.add();
		if(res==false){
			this.msg = "…Í«Î ß∞‹!";
		}
		else{
			this.msg = "…Í«Î≥…π¶!";
		}
		return "main";
	}
	
	public A1011Services getA1011Services() {
		return a1011Services;
	}

	public void setA1011Services(A1011Services a1011Services) {
		this.a1011Services = a1011Services;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}

