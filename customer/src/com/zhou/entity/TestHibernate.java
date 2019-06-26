package com.zhou.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class TestHibernate {
	@Test
	public void test1() {
		// 加载配置文件
		Configuration configuration = new Configuration().configure();
		// 创建工厂
		SessionFactory sf = configuration.buildSessionFactory();
		// 得到 session
		Session s = sf.openSession();

		// 开启事物
		Transaction t = s.beginTransaction();
		User user = new User();
		user.setUsername("username");
		user.setPassword("password");
		user.setSex("sex");
		user.setAge(16);
		user.setTelephonr("telephonr");

		s.save(user);

		t.commit();

	}

}
