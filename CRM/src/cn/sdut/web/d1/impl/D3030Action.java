package cn.sdut.web.d1.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.web.d1.D3030Support;

public class D3030Action extends D3030Support {

	@Override
	public String execute() throws Exception {

		try {
			List rows =this.d3030Services.query();
			if(rows!=null) {
				this.rows=rows;
				String pageinfo=this.d3030Services.getPageInfo("d3030Action");
				Map request=(Map) ActionContext.getContext().get("request");
			    request.put("pageinfo", pageinfo);
			}
			else{
				this.msg="û�з�������������!";
			}
			
		}
		catch (Exception e) {
			this.msg="�������!";

			e.printStackTrace();

		}
		
		return "main";
	}

}
