package cn.sdut.web.d1.impl;

import cn.sdut.web.d1.D2020Support;

public class D2022Action extends D2020Support {

	@Override
	public String execute() throws Exception {

		try{
		    boolean tag=this.d2020Services.delete();
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
