package cn.sdut.web.a1.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.system.Tools;
import cn.sdut.web.a1.A1022Support;

import com.opensymphony.xwork2.ActionContext;

public class A1024Action extends A1022Support {

	@Override
	public String execute() throws Exception {
		try {
			this.oclg0804 = Tools.getOptions("LG0804");
			boolean res = this.getA1021Services().cancel();
			if (res == true) {
				this.msg = "取消成功";
			} else {
				this.msg = "取消失败";
			}
			List rows = this.getA1021Services().query();
			this.rows = rows;
			String pageinfo = this.getA1021Services()
					.getPageInfo("a1023Action");
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("pageinfo", pageinfo);
		} catch (Exception e) {
			this.msg = "网络故障";
			e.printStackTrace();
		}
		return "main";
	}

}
