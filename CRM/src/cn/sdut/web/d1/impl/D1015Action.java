package cn.sdut.web.d1.impl;

import cn.sdut.web.d1.D1010Support;

public class D1015Action extends D1010Support {

	@Override
	public String execute() throws Exception {
		try{
			boolean tag=this.d1012Services.update();
		//boolean tag=this.d1013Services.personUpdate();
	    if(tag){
	    	this.msg="数据修改成功!";
	    }
	    else{
	    	this.msg="数据修改失败!";
	    }
		}
		catch (Exception e) {

			e.printStackTrace();
		}
	    return "main";
	}

}
