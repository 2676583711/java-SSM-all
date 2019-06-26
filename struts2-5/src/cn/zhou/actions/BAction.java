package cn.zhou.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.zhou.entity.User;

/*
 * struts 封装数据
 * 
 * 第二种封装方式
 * 
 * 模型驱动：
 * 实现 modeldriven接口
 * 
 * 注：模型驱动与属性封装不能同时使用，否则仅模型驱动可以成功封装数据，属性封装无效果
 * 
 */
public class BAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();

	@Override
	public User getModel() {

		return user;
	}

	@Override
	public String execute() throws Exception {

		System.out.println(user.toString());

		return NONE;
	}
}
