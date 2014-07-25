package cn.sdut.web.a1;

import java.util.Map;

import cn.sdut.services.LoginServices;
import cn.sdut.system.Tools;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction {

	public String execute() throws Exception {
		String forward = "login";
		try {
			this.services.setMapDto(Tools.describe());
			Map ins = services.getInstance();
			System.out.println("sad::::"+ins);
			if (ins != null) {
				Map session = ActionContext.getContext().getSession();
				session.put("USERINFO", ins);
				forward = "main";
			} else {
				this.msg = "”√ªß√˚ªÚ√‹¬Î¥ÌŒÛ!";
			}
		} catch (Exception ex) {
			this.msg = "Õ¯¬Áπ ’œ!";
			ex.printStackTrace();
		}
		return forward;
	}

	private LoginServices services = null;
	protected String msg = null;
	protected String username = null;
	protected String pwd = null;

	public void setServices(LoginServices services) {
		this.services = services;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
