package cn.zhou.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.zhou.entity.Goods;
import cn.zhou.entity.Order;
import cn.zhou.utils.TestHibernateUtils;

public class TestHibernate {

	/*
	 * 本方法在配置文件中实现了cascade级联属性，可以简化添加操作了
	 */
	@Test
	public void test1() {
		Goods g = new Goods();
		g.setName("手机");
		g.setPrice("1520元");

		Order o = new Order();
		o.setNumber(100);
		o.setSell(250);

		g.getOrderSet().add(o);

		TestHibernateUtils.add(g);

	}

	/*
	 * 没有添加级联属性的复杂添加操作
	 */
	@Test
	public void test2() {

		Session s = TestHibernateUtils.getSession();
		Transaction t = s.beginTransaction();

		Goods g = new Goods();
		g.setName("苹果手机");
		g.setPrice("120元");

		Order o = new Order();
		o.setNumber(100);
		o.setSell(250);

		o.setGoods(g);
		g.getOrderSet().add(o);

		s.save(g);
		s.save(o);
		t.commit();

		s.close();
	}

	/*
	 * 级联删除
	 */
	@Test
	public void tes3() {
		Session s = TestHibernateUtils.getSession();
		Goods g = s.get(Goods.class, 12);
		s.delete(g);
		s.beginTransaction().commit();
		// s.close();
	}

	@Test
	public void test4() {

		Session s = TestHibernateUtils.getSession();
		Transaction t = s.beginTransaction();
		Goods g = s.get(Goods.class, 1);
		Order o = s.get(Order.class, 1);

		g.getOrderSet().add(o);
		o.setGoods(g);

		t.commit();
	}

}
