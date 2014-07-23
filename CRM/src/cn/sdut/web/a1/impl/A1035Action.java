package cn.sdut.web.a1.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.web.a1.A1030Support;

import com.opensymphony.xwork2.ActionContext;

public class A1035Action extends A1030Support {

	@Override
	public String execute() throws Exception {
		try {
			boolean res = this.getA1030Services().cancel();
			if (res == true) {
				this.msg = "取消成功";
			} else {
				this.msg = "取消失败";
			}
			List rows = this.getA1030Services().query();
			this.rows = rows;
			String pageinfo = this.getA1030Services()
					.getPageInfo("a1032Action");
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("pageinfo", pageinfo);
		} catch (Exception e) {
			this.msg = "网络故障";
			e.printStackTrace();
		}
		return "main";
	}

}
