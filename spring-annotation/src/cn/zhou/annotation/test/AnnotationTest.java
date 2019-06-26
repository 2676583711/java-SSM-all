package cn.zhou.annotation.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhou.spring.annotation.User;

public class AnnotationTest {

	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		User user = (User) ac.getBean("user");

		System.out.println(user);
		user.test();
		user.dao();
		user.service();
	}

}
