package cn.sdut.web.d1.impl;

import cn.sdut.web.d1.D2020Support;

public class D2022Action extends D2020Support {

	@Override
	public String execute() throws Exception {

		try{
		    boolean tag=this.d2020Services.delete();
	        System.out.println(tag);
	        if(tag) {
	        	this.msg="数据删除成功!";
	        }
	        else
	        {
	        	this.msg="数据删除失败!";
	        }
	        System.out.println("我的msg是什么呢？？"+msg);
		}
		catch (Exception e) {

			e.printStackTrace();
		}
	    return "main";
	
	}

}
