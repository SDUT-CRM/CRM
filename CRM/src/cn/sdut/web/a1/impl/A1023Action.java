package cn.sdut.web.a1.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.web.a1.A1022Support;

import com.opensymphony.xwork2.ActionContext;

public class A1023Action extends A1022Support {

	@Override
	public String execute() throws Exception {
		try {
			List rows = this.getA1021Services().query();
			if (rows.size() > 0) {
				this.rows = rows;
				String pageinfo = this.getA1021Services().getPageInfo(
						"a1023Action");
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
