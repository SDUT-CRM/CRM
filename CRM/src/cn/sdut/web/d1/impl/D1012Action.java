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
	        	this.msg="����ɾ���ɹ�!";
	        }
	        else
	        {
	        	this.msg="����ɾ��ʧ��!";
	        }
	        System.out.println("�ҵ�msg��ʲô�أ���"+msg);
		}
		catch (Exception e) {

			e.printStackTrace();
		}
	    return "main";
	}
	

}
