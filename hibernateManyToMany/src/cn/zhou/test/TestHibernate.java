package cn.zhou.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.zhou.entity.Course;
import cn.zhou.entity.Student;
import cn.zhou.utils.TestHibernateUtils;

public class TestHibernate {

	/*
	 * 使用cascade=save-update属性进行级联添加操作
	 */
	@Test
	public void test1() {

		Session s = TestHibernateUtils.getCurrentSession();
		// System.out.println(s.toString());

		Transaction t = s.beginTransaction();

		Student s1 = new Student();
		s1.setStu_name("张三");
		s1.setStu_score(63.0);

		Student s2 = new Student();
		s2.setStu_name("刘流");
		s2.setStu_score(59.9);

		Course c1 = new Course();
		c1.setCourse_name("语文");
		c1.setPass_score(60.0);

		Course c2 = new Course();
		c2.setCourse_name("数学");
		c2.setPass_score(72.0);

		Course c3 = new Course();
		c3.setCourse_name("体育");
		c3.setPass_score(90.0);

		s1.getCourseSet().add(c1);
		s1.getCourseSet().add(c2);

		s2.getCourseSet().add(c1);
		s2.getCourseSet().add(c2);
		s2.getCourseSet().add(c3);

		s.save(s1);
		s.save(s2);

		t.commit();

		s.close();

	}

	/*
	 * 使用cascade=save-update属性进行级联添加操作
	 */
	@Test
	public void test2() {

		Student s1 = new Student();
		s1.setStu_name("张三");
		s1.setStu_score(63.0);

		Student s2 = new Student();
		s2.setStu_name("刘流");
		s2.setStu_score(59.9);

		Course c1 = new Course();
		c1.setCourse_name("语文");
		c1.setPass_score(60.0);

		Course c2 = new Course();
		c2.setCourse_name("数学");
		c2.setPass_score(72.0);

		Course c3 = new Course();
		c3.setCourse_name("体育");
		c3.setPass_score(90.0);

		s1.getCourseSet().add(c1);
		s1.getCourseSet().add(c2);

		s2.getCourseSet().add(c1);
		s2.getCourseSet().add(c2);
		s2.getCourseSet().add(c3);

		TestHibernateUtils.addMany(s1, s2);

	}

	/*
	 * 使用cascade=save-update属性进行级联删除操作
	 */
	@Test
	public void test3() {

		Session s = TestHibernateUtils.getSession();

		Student stu = s.get(Student.class, 1);
		s.delete(stu);

		s.beginTransaction().commit();
		s.close();
	}

	/*
	 * 操作第三张数据表 间接操作其他的两个表的数据
	 */

	@Test
	public void test4() {

		Session s = TestHibernateUtils.getSession();

		Student stu = s.get(Student.class, 4);
		Course c = s.get(Course.class, 6);

		stu.getCourseSet().remove(c);

		s.beginTransaction().commit();
		s.close();
	}

	@Test
	public void test5() {

		Session s = TestHibernateUtils.getSession();

		Student stu = s.get(Student.class, 4);
		//Course c = s.get(Course.class, 4);

		Set<Course> set = stu.getCourseSet();
		
		for(Course c:set) {
			System.out.println(set.toString());

		}
		
		s.beginTransaction().commit();
		s.close();
	}

}
