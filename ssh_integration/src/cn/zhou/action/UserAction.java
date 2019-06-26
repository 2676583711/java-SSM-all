package cn.zhou.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.zhou.service.UserService;

public class UserAction extends ActionSupport {

	private UserService service;
	public void setService(UserService service) {
		this.service = service;
	}

	public String add() {
		System.out.println("action-add..........");
		service.add();
		return "add";
	}

}
