package cn.sdut.web.b1.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.system.Tools;
import cn.sdut.web.b1.B1030Support;

public class B1032Action extends B1030Support {

	@Override
	public String execute() throws Exception {
		try {
			boolean res = this.getB1030Services().modify();
			if(res==true){
				this.msg = "����ɹ�!";
			}
			else{
				this.msg = "����ʧ��!";
			}
		} catch (Exception e) {
			this.msg = "�������";
			e.printStackTrace();
		}
		return "main";
	}
}
