package com.zhou.actions;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
	
	public String login() {
		System.out.println("login success....");
		
		return "login";
	}

	public String add() {

		return "add";
	}

	public String delete() {

		return "delete";
	}

	public String search() {

		return "search";
	}

	public String update() {

		return "update";
	}

}
