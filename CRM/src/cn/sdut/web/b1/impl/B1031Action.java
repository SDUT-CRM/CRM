package cn.sdut.web.b1.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.system.Tools;
import cn.sdut.web.b1.B1030Support;

public class B1031Action extends B1030Support {

	@Override
	public String execute() throws Exception {
		Map ins = this.getB1030Services().queryById();
		System.out.println("ins=="+ins);
		BeanUtils.populate(this, ins);
		return "main";
	}
}
