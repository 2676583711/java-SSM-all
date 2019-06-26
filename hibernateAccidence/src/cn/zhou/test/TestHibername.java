package cn.zhou.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.zhou.entity.User;

public class TestHibername {

	@Test
	public void test1() {

		User u = new User();
		u.setUsername("赵丽颖");
		u.setPassword("woamn");
		u.setAddress("china");

		System.out.println(u.getClass().getTypeName());

		TestHibernateUtils.add(u);

	}

	/*
	 * 使用hibernate查询数据库 根据id查询 session.get();
	 */
	@Test
	public void test2() {

		/*
		 * User user = new User(); String s = TestHibernateUtils.findById(User.class,
		 * 1); System.out.println(s);
		 */

		Session s = TestHibernateUtils.getSession(); // 得到session

		Transaction t = s.beginTransaction();
		// hibernate查询数据时，首先查询一级缓存中是否有目标数据，没有,则去数据库查询
		// 查询出来目标数据后，hibernate会把目标数据存入一级缓存中，以备下次相同的查询操作
		User u = s.get(User.class, 1); // 根据id查询数据
		System.out.println(u);

		// hibernate的一级缓存，同样的查询操作，第二次不会发送sql语句，直接从第一次的查询中都结果
		User u2 = s.get(User.class, 1); // 根据id查询数据
		System.out.println(u2);

		/*
		 * 生成一级缓存文件的同时，自动生成快照区（副本文件，类似于备份）
		 * 如果在session域中（sessionfactory.opensession（）到session.close（））
		 * 调用了实体类的set方法进行了数据的修改 提交事务的时候，会自动比较两个文件的内容是否一致，如果不是一以及缓存文件为主，
		 * 把一级缓存文件更新到数据库中（自动更新，不需要手动使用update方法）
		 */
		u2.setUsername("黄飞鸿");
		t.commit();
		TestHibernateUtils.close();

	}

	/*
	 * 先根据id得到查询结果 然后以查询结果进行数据修改 session.get(); session.update()/save();
	 * 
	 */
	@Test
	public void test3() {

		/*
		 * User user = new User(); String s = TestHibernateUtils.findById(User.class,
		 * 1); System.out.println(s);
		 */

		Session s = TestHibernateUtils.getSession(); // 得到session

		Transaction t = s.beginTransaction();

		User u = s.get(User.class, 2); // 根据id查询数据

		u.setUsername("张三"); // 设置想要修改的值

		s.save(u); // 使用save方法修改数据 但不建议使用
		// s.update(u); // update方法 修改数据，常规操作
		System.out.println(u);

		t.commit();

		TestHibernateUtils.close();

	}

	/*
	 * 使用session.updateOrSave（）修改数据库数据
	 */
	@Test
	public void updateOrSave() {
		Session s = TestHibernateUtils.getSession();

		Transaction t = s.beginTransaction();
		User u = s.get(User.class, 4);
		u.setUsername("赵红光");

		s.saveOrUpdate(u);

		t.commit();
	}

	/*
	 * 根据查询结果 删除数据库数据 session.delete();
	 */
	@Test
	public void test4() {

		/*
		 * User user = new User(); String s = TestHibernateUtils.findById(User.class,
		 * 1); System.out.println(s);
		 */

		Session s = TestHibernateUtils.getSession(); // 得到session

		Transaction t = s.beginTransaction();
		User u = s.get(User.class, 5); // 根据id查询数据
		System.out.println(u);

		s.delete(u);

		t.commit();

		TestHibernateUtils.close();

	}

	/*
	 * 使用绑定当地线程的session
	 */
	@Test
	public void test5() {
		Session s = null;
		Transaction t = null;

		try {
			s = TestHibernateUtils.getCurrentSession();
			t = s.beginTransaction();

			User u = new User();
			u.setUsername("狗子强");
			u.setPassword("gouziqiang");
			u.setAddress("diyu");

			s.save(u);

			t.commit();

		} catch (Exception e) {
			t.rollback();
		} finally {
			// TestHibernateUtils.close();
			s.close();

		}

	}

	/*
	 * 使用绑定当地线程的session
	 */
	@Test
	public void test6() {

		SessionFactory sf = TestHibernateUtils.getSessionFactory();
		// Session s = TestHibernateUtils.getCurrentSession();
		Session s = sf.getCurrentSession();

		Transaction t = s.beginTransaction();
		User u = new User();
		u.setUsername("狗子强");
		u.setPassword("gouziqiang");
		u.setAddress("diyu");
		s.save(u);
		t.commit();

		// TestHibernateUtils.close();
		s.close();
		sf.close();

	}

	/*
	 * session.createcriteria()方法进行查询操作;
	 * 
	 * 另外还有 session.createQuery()
	 * session.createSqlQuery()等方法(这该方法返回值是一个数组，若想直接输出结果可以使用Arrays.toString(返回值),
	 * 转换一下即可)
	 * 
	 * 不过都过期了，官方不建议使用这些方法 最好使用session.get()方法
	 */
	@Test
	public void test7() {

		Session s = TestHibernateUtils.getCurrentSession();

		Transaction t = s.beginTransaction();

		Criteria criteria = s.createCriteria(User.class);

		List<User> list = criteria.list();
		System.out.println(list);
		for (User user : list) {
			System.out.println(user);
		}

		t.commit();

		// TestHibernateUtils.close();
		s.close();

	}
}
