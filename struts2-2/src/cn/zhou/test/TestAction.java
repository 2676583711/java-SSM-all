package cn.zhou.test;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	// public String execute() {
	// System.out.println("exe....");
	// return "exe";
	// }

	public String add() {
		System.out.println("add()......");
		return "add";
	}

	public String update() {
		System.out.println("update()....");
		return "update";
	}

}
