package cn.sdut.web.d1.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.web.d1.D1010Support;

import com.opensymphony.xwork2.ActionContext;

public class D1010Action extends D1010Support {

	@Override
	public String execute() throws Exception {

		try
		{
			List rows =this.getD1010Services().query();
			System.out.println(rows);
			if(rows.size()>0) 
			{
				this.rows=rows;
				String pageinfo=this.getD1010Services().getPageInfo("d1010Action");
				Map request=(Map) ActionContext.getContext().get("request");
				request.put("pageinfo", pageinfo);
			}
		    else
		    {
			    this.msg="没有符合条件的数据！";
		    }
		}
		catch (Exception e) {
			this.msg="网络故障！";
			e.printStackTrace();			
		}
		return "main";
	}

}
