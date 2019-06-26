package cn.zhou.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import cn.zhou.entity.User;

public class TestHibernate {

	@Test
	public void test() {
		Configuration con = new Configuration().configure();

		SessionFactory sf = con.buildSessionFactory();

		Session s = sf.openSession();
		User user = new User();

		s.save(user);
//		
	ComboPooledDataSource c=new ComboPooledDataSource();
//		c.setDriverClass(driverClass);
//		c.setUser(user);
//		c.setPassword(password);
//		c.setJdbcUrl(jdbcUrl);
		

		System.out.println(s);
	}

}
