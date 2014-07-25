package cn.sdut.web.d1.impl;

import cn.sdut.web.d1.D3030Support;

public class D3034Action extends D3030Support {

	@Override
	public String execute() throws Exception {

		try{
			this.msg=this.d3030Services.update()?"配件修改成功":"配件修改失败";
		}
		catch (Exception e) {
			this.msg="网络故障";
			e.printStackTrace();
		}
		
		
		return "main";
	}

}
