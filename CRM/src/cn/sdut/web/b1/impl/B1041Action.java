package cn.sdut.web.b1.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.system.Tools;
import cn.sdut.web.b1.B1040Support;

import com.opensymphony.xwork2.ActionContext;

public class B1041Action extends B1040Support {

	@Override
	public String execute() throws Exception {
		try {
			List rows = this.getB1040Services().queryForPage();
			if (rows.size() > 0) {
				this.rows = rows;
				String pageinfo = this.getB1040Services().getPageInfo1(
						"b1041Action");
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
