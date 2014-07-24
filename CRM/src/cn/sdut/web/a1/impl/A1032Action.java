package cn.sdut.web.a1.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.system.Tools;
import cn.sdut.web.a1.A1030Support;

import com.opensymphony.xwork2.ActionContext;

public class A1032Action extends A1030Support {

	@Override
	public String execute() throws Exception {
		try {
			this.oclg1804 = Tools.getOptions("LG1804");
			this.oclg1701 = Tools.getOptions("LG1701");
			List rows = this.getA1030Services().query();
			if (rows.size() > 0) {
				this.rows = rows;
				String pageinfo = this.getA1030Services().getPageInfo(
						"a1032Action");
				System.out.println(pageinfo);
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
