package cn.sdut.web.d1.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.web.d1.D2020Support;

import com.opensymphony.xwork2.ActionContext;

public class D2020Action extends D2020Support {

	@Override
	public String execute() throws Exception {

		try {
			List rows =this.d2020Services.query();
			if(rows!=null) {
				this.rows=rows;
				String pageinfo=this.d2020Services.getPageInfo("d2020Action");
				Map request=(Map) ActionContext.getContext().get("request");
			    request.put("pageinfo", pageinfo);
			}
			else{
				this.msg="没有符合条件的数据!";
			}
			
		}
		catch (Exception e) {
			this.msg="网络故障!";

			e.printStackTrace();

		}
		
		return "main";
	}

}
