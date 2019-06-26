package cn.zhou.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhou.spring.jdbctemplate.annotation.UserService;

public class TestService {

	@Test
	public void test1() {

		ApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");

		UserService service = (UserService) ac.getBean("service");

		service.add();

	}
}
