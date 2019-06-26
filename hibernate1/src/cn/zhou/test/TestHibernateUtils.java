package cn.zhou.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernateUtils {

	private static Configuration con = null;
	private static SessionFactory sf = null;
	private static Session s = null;
	private static Transaction t = null;

	static {

		con = new Configuration().configure();
		sf = con.buildSessionFactory();
		s = sf.openSession();
	}

	
	public static void send(Object clazz) {

		try {
			t = s.beginTransaction();
			s.save(clazz);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

	}
	
	
	public static Session getSession() {
		return s;
	}
	

}
