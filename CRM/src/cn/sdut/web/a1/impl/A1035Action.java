package cn.sdut.web.a1.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.web.a1.A1030Support;

import com.opensymphony.xwork2.ActionContext;

public class A1035Action extends A1030Support {

	@Override
	public String execute() throws Exception {
		try {
			boolean res = this.getA1030Services().cancel();
			if (res == true) {
				this.msg = "ȡ���ɹ�";
			} else {
				this.msg = "ȡ��ʧ��";
			}
			List rows = this.getA1030Services().query();
			this.rows = rows;
			String pageinfo = this.getA1030Services()
					.getPageInfo("a1032Action");
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("pageinfo", pageinfo);
		} catch (Exception e) {
			this.msg = "�������";
			e.printStackTrace();
		}
		return "main";
	}

}
