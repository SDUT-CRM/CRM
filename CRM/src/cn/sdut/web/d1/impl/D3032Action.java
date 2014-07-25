package cn.sdut.web.d1.impl;

import cn.sdut.web.d1.D3030Support;

public class D3032Action extends D3030Support {

	@Override
	public String execute() throws Exception {

		try{
			this.msg=this.d3030Services.delete()?"Åä¼şÉ¾³ı³É¹¦":"Åä¼şÉ¾³ıÊ§°Ü";
		}
		catch (Exception e) {

			this.msg="ÍøÂç¹ÊÕÏ";
            e.printStackTrace();
		}
		return "main";
	}

}
