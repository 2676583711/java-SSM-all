package cn.zhou.spring.aop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhou.spring.aop.Dog;

public class TestAop {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

		Dog d = (Dog) ac.getBean("dog");

		System.out.println(d);
		d.test("ok");

	}
}
