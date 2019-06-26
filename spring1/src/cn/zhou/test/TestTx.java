package cn.zhou.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhou.spring.transaction.annotation.MoneyService;

public class TestTx {

	@Test
	public void test1() {
		
		//加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean3.xml");

		
		//得到类的实例对象
		MoneyService ms = (MoneyService) ac.getBean("service");

		ms.moneyManager();

	}

}
