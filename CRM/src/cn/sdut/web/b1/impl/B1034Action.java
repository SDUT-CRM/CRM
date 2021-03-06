package cn.sdut.web.b1.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.system.Tools;
import cn.sdut.web.b1.B1030Support;

public class B1034Action extends B1030Support {

	@Override
	public String execute() throws Exception {
		try {
			boolean res = this.getB1030Services().update();
			if(res==true){
				this.msg = "标记成功!";
			}
			else{
				this.msg = "标记失败!";
			}
			this.oclg1701 = Tools.getOptions("LG1701");
			this.ocllg18 = Tools.getOptions("LLG18");
			List rows = this.getB1030Services().query2();
			if (rows.size() > 0) {
				this.rows = rows;
				String pageinfo = this.getB1030Services().getPageInfo(
						"b1033Action");
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
