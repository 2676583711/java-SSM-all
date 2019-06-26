package cn.zhou.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhou.spring.aspectj.annotation.Dog;

public class TestBook {

	@Test
	public void test1() {
		// 第一步 加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean1.xml");
		Dog dog = (Dog) ac.getBean("dog");

		dog.dog();

	}
}
