package cn.zhou.spring.jdbctemplate.annotation;

public class UserService {

	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void add() {
		int i = dao.add();
		System.out.println(i);
	}
}
