package cn.zhou.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhou.spring.Person;
import cn.zhou.spring.User;

public class TestUser {

	@Test
	public void test1() {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		User user = (User) applicationContext.getBean("user");
		User user2 = (User) applicationContext.getBean("user");

		System.out.println(user);
		user.add();

		System.out.println(user2);

		user.test();
	}

	@Test
	public void test2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

		Person p = (Person) ac.getBean("person");
		p.test();

	}
}
