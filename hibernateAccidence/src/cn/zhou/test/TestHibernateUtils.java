package cn.zhou.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernateUtils {

	private static Configuration con = null;
	private static SessionFactory sf = null;
	private static Session s = null;

	static {

		con = new Configuration().configure();
		sf = con.buildSessionFactory();
		s = sf.openSession();
	}

	public static void add(Object clazz) {
		Transaction t = null;

		try {
			t = s.beginTransaction();
			s.save(clazz);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		close();

	}

	public static String findById(Object clazz, int id) {

		String back = s.get((Class) clazz, id);

		return back;

	}

	public static void close() {
		s.close();
		sf.close();

	}

	public static Session getSession() {
		return s;
	}

	/*
	 * 获取与本地线程绑定的session 并且这种线程不需要手动关闭 因为完成调用之后hibernate会自动关闭 手动关闭反而会报错
	 */

	public static SessionFactory getSessionFactory() {
		return con.buildSessionFactory();
	}

	public static Session getCurrentSession() {
		Configuration c = new Configuration().configure();
		SessionFactory sf2 = c.buildSessionFactory();
		Session session = sf2.getCurrentSession();

		return sf2.getCurrentSession();
	}

}
