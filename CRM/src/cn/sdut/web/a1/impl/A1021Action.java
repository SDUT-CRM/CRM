package cn.sdut.web.a1.impl;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.web.a1.A1020Support;

public class A1021Action extends A1020Support {

	@Override
	public String execute() throws Exception {
		try {
			Map ins = this.getA1020Services().getInstance();
			if (ins != null) {
				if(!ins.get("lg0707").toString().equals("1")){
					this.msg = "��ʾ���û��ֹͣ����!";
				}
				if(this.getA1020Services().check()==false){
					this.msg = "��ʾ�����ѱ����û!";
				}
				BeanUtils.populate(this, ins);
			} else {
				this.msg = "�����ݲ�����!";
			}
		} catch (Exception e) {
			this.msg = "�������!";
			e.printStackTrace();
		}
		return "main";
	}

}
