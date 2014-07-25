package cn.sdut.web.b1.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.system.Tools;
import cn.sdut.web.b1.B1030Support;

public class B1034Action extends B1030Support {

	@Override
	public String execute() throws Exception {
		try {
			boolean res = this.getB1030Services().update();
			if(res==true){
				this.msg = "��ǳɹ�!";
			}
			else{
				this.msg = "���ʧ��!";
			}
			this.oclg1701 = Tools.getOptions("LG1701");
			this.ocllg18 = Tools.getOptions("LLG18");
			List rows = this.getB1030Services().query2();
			if (rows.size() > 0) {
				this.rows = rows;
				String pageinfo = this.getB1030Services().getPageInfo(
						"b1033Action");
				Map request = (Map) ActionContext.getContext().get("request");
				request.put("pageinfo", pageinfo);
			} else {
				this.msg = "û�з�������������";
			}
		} catch (Exception e) {
			this.msg = "�������";
			e.printStackTrace();
		}
		return "main";
	}
}
