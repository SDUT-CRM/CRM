package cn.sdut.web.a1.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.system.Tools;
import cn.sdut.web.a1.A1041Support;

public class A1042Action extends A1041Support {

	@Override
	public String execute() throws Exception {
		try {
			List rows = this.getA1041Services().queryById();
			if (rows.size() > 0) {
				this.rows = rows;
				String pageinfo = this.getA1041Services().getPageInfo("a1042Action");
				Map request = (Map) ActionContext.getContext().get("request");
				request.put("pageinfo", pageinfo);
			} else {
				this.msg = "没有符合条件的数据";
			}
		} catch (Exception e) {
			this.msg = "网络故障";
			e.printStackTrace();
		}
		return "main";
	}

}
