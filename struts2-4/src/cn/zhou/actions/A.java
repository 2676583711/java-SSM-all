package cn.zhou.actions;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class A extends ActionSupport {

	public String add() {
		System.err.println("addddd............");
		return SUCCESS;
	}

	public String update() {

		System.out.println("update.....");
		return NONE;
	}

	public String list() {
		return "list";
	}

	public String login() {

		HttpServletRequest request = ServletActionContext.getRequest();

		HttpServletResponse response = ServletActionContext.getResponse();
		try {
			response.getWriter().println("login-action.response.23333");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println("username:" + username + "," + "password:" + password);

		System.out.println("**************************");

		ActionContext ac = ActionContext.getContext();

		Map<String, Object> map = ac.getParameters();
		Set<String> set = map.keySet();

		for (String key : set) {
			Object[] object = (Object[]) map.get(key);

			request.setAttribute("username", Arrays.toString(object));

			System.out.println(key + ":" + object);

		}

		return "login";
	}
}
