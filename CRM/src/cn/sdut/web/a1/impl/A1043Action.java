package cn.sdut.web.a1.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.system.Tools;
import cn.sdut.web.a1.A1041Support;

public class A1043Action extends A1041Support {

	@Override
	public String execute() throws Exception {
		try {
			boolean res = this.getA1041Services().add();
			if(res==true){
				List rows = this.getA1041Services().queryById();
				this.rows = rows;
				String pageinfo = this.getA1041Services().getPageInfo("a1042Action");
				Map request = (Map) ActionContext.getContext().get("request");
				request.put("pageinfo", pageinfo);
				this.msg = "×·¼Ó³É¹¦!";
			}
			else{
				this.msg = "×·¼ÓÊ§°Ü!";
			}
		} catch (Exception e) {
			this.msg = "ÍøÂç¹ÊÕÏ";
			e.printStackTrace();
		}
		return "main";
	}

}
