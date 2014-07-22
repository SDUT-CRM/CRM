package cn.sdut.web.a1.impl;

import cn.sdut.services.A1021Services;
import cn.sdut.system.Tools;
import cn.sdut.web.a1.A1020Support;

public class A1022Action extends A1020Support {
	
	protected A1021Services a1021Services = null;
	protected String msg = null;

	public String execute() throws Exception{
		a1021Services.setMapDto(Tools.describe());
		boolean res = a1021Services.add();
		if(res==false){
			this.msg = "参加失败!";
		}
		else{
			this.msg = "参加成功!";
		}
		return "main";
	}
	
	public A1021Services getA1021Services() {
		return a1021Services;
	}

	public void setA1021Services(A1021Services a1021Services) {
		this.a1021Services = a1021Services;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}

