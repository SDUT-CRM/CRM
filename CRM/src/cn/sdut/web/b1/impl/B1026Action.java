package cn.sdut.web.b1.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.web.b1.B1021Support;

import com.opensymphony.xwork2.ActionContext;

public class B1026Action extends B1021Support {

	@Override
	public String execute() throws Exception {
		try {
			boolean res = this.getB1021Services().add();
			if(res==true){
				List rows = this.getB1021Services().queryById1();
				this.rows = rows;
				String pageinfo = this.getB1021Services().getPageInfo("b1025Action");
				Map request = (Map) ActionContext.getContext().get("request");
				request.put("pageinfo", pageinfo);
				this.msg = "»Ø´ð³É¹¦!";
			}
			else{
				this.msg = "»Ø´ðÊ§°Ü!";
			}
		} catch (Exception e) {
			this.msg = "ÍøÂç¹ÊÕÏ";
			e.printStackTrace();
		}
		return "main";
	}

}
