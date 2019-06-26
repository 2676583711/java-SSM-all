package cn.zhou.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import cn.zhou.entity.User;

//import com.mchange.v2.c3p0.ComboPooledDataSource;
@Transactional
public class UserDaoImpl implements UserDao {

	private HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public void add() {

		User user = new User();
		user.setUsername("张三");
		user.setPassword("tomj7194");

		ht.save(user);

	}

	@Override
	public void search() {
		// 使hibernateTemplate的get方法查询
		System.out.println("使用get方法查询:");
		User u = ht.get(User.class, 1);
		System.out.println(u);

		// 使hibernateTemplate的find方法无条件查询
		System.out.println("使用find方法无条件查询");
		List<User> list = (List<User>) ht.find("from User");
		for (User user : list) {
			System.out.println(user);
		}

		// 使hibernateTemplate的find方法有条件查询
		System.out.println("使用find方法无条件查询");
		List<User> list2 = (List<User>) ht.find("from User where username=?", "jie");
		for (User user2 : list2) {
			System.out.println(user2);
		}

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
