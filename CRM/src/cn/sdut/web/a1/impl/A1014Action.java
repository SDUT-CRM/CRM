package cn.sdut.web.a1.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.web.a1.A1012Support;

import com.opensymphony.xwork2.ActionContext;

public class A1014Action extends A1012Support {

	@Override
	public String execute() throws Exception {
		try {
			boolean res = this.getA1011Services().cancel();
			if (res == true) {
				this.msg = "ȡ���ɹ�";
			} else {
				this.msg = "ȡ��ʧ��";
			}
			List rows = this.getA1011Services().query();
			this.rows = rows;
			String pageinfo = this.getA1011Services()
					.getPageInfo("a1013Action");
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("pageinfo", pageinfo);
		} catch (Exception e) {
			this.msg = "�������";
			e.printStackTrace();
		}
		return "main";
	}

}
