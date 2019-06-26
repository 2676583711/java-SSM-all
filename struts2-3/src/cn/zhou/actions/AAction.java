package cn.zhou.actions;

import com.opensymphony.xwork2.ActionSupport;
/*
 * 8080 8005 8009  +1
 * 
 */
public class AAction extends ActionSupport {

	public String execute() {
		
		System.out.println("execute..........");
		return NONE;

	}

	public String add() {

		System.out.println("add......");
		return NONE;
	}

	public String update() {

		System.out.println("update.....");

		return NONE;
	}

}

