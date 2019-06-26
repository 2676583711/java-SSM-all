package cn.zhou.actions;

import com.opensymphony.xwork2.ActionSupport;

import cn.zhou.entity.User;

public class CAction extends ActionSupport {
	/*
	 * 第三种表达式封装
	 * 
	 */

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() {

		System.out.println(user.toString());
		return NONE;
	}

}
