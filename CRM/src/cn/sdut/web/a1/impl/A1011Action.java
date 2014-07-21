package cn.sdut.web.a1.impl;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.web.a1.A1010Support;

public class A1011Action extends A1010Support {

	@Override
	public String execute() throws Exception {
		try {
			Map ins = this.getA1010Services().getInstance();
			if (ins != null) {
				if(ins.get("lg0509").toString().equals("2")){
					this.msg = "��ʾ����ҵ����ֹͣ����!";
				}
				if(this.getA1010Services().check()==false){
					System.out.println("checked");
					this.msg = "��ʾ�����Ѱ����ҵ��!";
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
