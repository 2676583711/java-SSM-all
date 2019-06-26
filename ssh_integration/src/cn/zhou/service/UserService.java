package cn.zhou.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhou.dao.UserDao;

public class UserService {

	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void add() {
		// dao.add();

		dao.search();
	}

	@Test
	public void test1() {
		// System.out.println(dao);
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean1.xml");
		System.out.println(ac.getBean("userAction"));
	}

}
