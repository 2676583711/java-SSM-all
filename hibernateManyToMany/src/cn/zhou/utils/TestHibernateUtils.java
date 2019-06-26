package cn.zhou.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernateUtils {

	private static Configuration con = null;
	private static SessionFactory sf = null;
	private static Session s = null;
	private static Session currentS = null;

	static {

		con = new Configuration().configure();
		sf = con.buildSessionFactory();
		s = sf.openSession();
		currentS = sf.getCurrentSession();
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

		s.close();
		sf.close();

	}

	public static void addMany(Object... cla) {

		Transaction t = null;

		try {
			t = currentS.beginTransaction();

			for (Object clazz : cla) {
				currentS.save(clazz);

			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		s.close();
		sf.close();

	}

	public static void delete(Object clazz, int id) {

		Transaction t = s.beginTransaction();

		Class back = currentS.get((Class) clazz, id);

		s.delete(back);
		t.commit();

		s.close();
	}

	public static Class findById(Object clazz, int id) {

		Class back = currentS.get((Class) clazz, id);

		return back;

	}

	public static Session getSession() {
		return s;
	}

	/*
	 * 获取与本地线程绑定的session 并且这种线程不需要手动关闭 因为完成调用之后hibernate会自动关闭 手动关闭反而会报错
	 */

	public static Session getCurrentSession() {

		return currentS;
	}

}
