package cn.zhou.actions;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.zhou.entity.User;

public class ListAction extends ActionSupport {
	
	
	/*
	 * 数据封装之list集合封装
	 * 
	 */
	private List<User> list;

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	@Override
	public String execute() throws Exception {

		System.out.println(list);
		return NONE;
	}
}
