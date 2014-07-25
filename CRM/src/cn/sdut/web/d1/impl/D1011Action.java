package cn.sdut.web.d1.impl;

import cn.sdut.web.d1.D1010Support;

public class D1011Action extends D1010Support {

	@Override
	public String execute() throws Exception {

		try{
			this.msg=this.d1010Services.addMs()?"添加成功":"添加失败";
		}
		catch (Exception e) {
			this.msg="网络故障";
			e.printStackTrace();
		}
		return "main";
	}

}
