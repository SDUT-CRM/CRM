package cn.sdut.web.d1.impl;

import cn.sdut.system.Tools;
import cn.sdut.web.d1.D1010Support;

public class D1012Action extends D1010Support {

	@Override
	public String execute() throws Exception {
		try{
		    boolean tag=this.d1012Services.delete();
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
