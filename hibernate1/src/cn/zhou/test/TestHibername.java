package cn.zhou.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.zhou.entity.User;

public class TestHibername {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure();

		SessionFactory sf = con.buildSessionFactory();

		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

		User u = new User();
		u.setUsername("jimy");
		u.setPassword("tom123");
		u.setAddress("japanse");

		s.save(u);

		t.commit();

		
		char sdk='c';
		Integer i=0;
		Integer i2=null;
		String i3="dsd56465";
		
		Character c2='c';
	}

	@Test
	public void test() {

		User u = new User();
		u.setUsername("赵丽颖");
		u.setPassword("woamn");
		u.setAddress("china");

		
		System.out.println(u.getClass().getTypeName());
		
		TestHibernateUtils.send(u);
		
		
		/*
		Session s=TestHibernateUtils.getSession();
		Transaction t=s.beginTransaction();
		s.save(u);
		t.commit();*/
	}

}
