package cn.zhou.actions;

import com.opensymphony.xwork2.ActionSupport;

public class AAction extends ActionSupport {
	/*
	 * 属性封装 表单提交的数据到实体类中
	 * 注：表单的name属性值必须与封装的属性一致
	 */

	private String username;
	private String password;

	@Override
	public String toString() {
		return "AAction [username=" + username + ", password=" + password + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {

		System.out.println(toString());
		return NONE;
	}
}
