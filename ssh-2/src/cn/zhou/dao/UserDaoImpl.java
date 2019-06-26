package cn.zhou.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import cn.zhou.entity.User;

@Transactional
public class UserDaoImpl implements UserDao {

	private HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public void add() {

		User u = new User();
		u.setName("张靓颖");
		u.setSex("felilman");
		u.setAge(36);

		ht.save(u);

	}

}
