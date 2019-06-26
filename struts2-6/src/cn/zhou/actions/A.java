package cn.zhou.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class A extends ActionSupport {

	/*
	 * 使用Struts2 的值栈 并存取数据 存数据有三种 1. set（“key”，“value”）； 2. push（“value”）； 3. get（）
	 * 方法
	 *
	 */
	private String name;
	
	public String getName() {
		return name;
	}
	
	public String add() {

		System.out.println("value.stack...");
//		ActionContext ac = ActionContext.getContext();  //获取actioncontext对象
		
//		ValueStack vs = ac.getValueStack();  // 获取值栈对象

//		vs.set("username", "tomy");  //使用 set方法 向值栈设值
//		
//		vs.push("push1927103");  // 使用push方法 向值栈设值

		name="name19971236";
		List<User> list=new ArrayList<User>();
		User user=new User();
		user.setUsername("timy");
		user.setPassword("110");
		user.setSex("man");
		
		User u=new User();
		u.setUsername("uuid.username");
		u.setPassword("u.psord");
		u.setSex("u.sex.man");
		
		list.add(user);
		list.add(u);
		
		ActionContext ac=ActionContext.getContext();
		ValueStack vs=ac.getValueStack();
		vs.set("list", list);
		
		
		return "add";
	}
	
	
	private List<User> list;
	
	public List<User> getList() {
		return list;
	}
	
	public String value() {
		list=new ArrayList<User>();
		User user=new User();
		user.setUsername("list1.name");
		user.setPassword("list1.ps");
		user.setSex("list1.sex");
		
		User u=new User();
		u.setUsername("list2.uname");
		u.setPassword("list2.ps");
		u.setSex("list2..man");
		
		list.add(user);
		list.add(u);
		
		
		return "success";
	}
}
