package cn.sdut.web.a1.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.system.Tools;
import cn.sdut.web.a1.A1040Support;

public class A1041Action extends A1040Support {

	@Override
	public String execute() throws Exception {
		try {
			this.oclg2007= Tools.getOptions("LG2007");
			List rows = this.getA1041Services().query();
			if (rows.size() > 0) {
				this.rows = rows;
				String pageinfo = this.getA1041Services().getPageInfo(
						"a1041Action");
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
