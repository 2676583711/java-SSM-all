package cn.zhou.service;

import cn.zhou.dao.UserDao;

public class UserService {
	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void add() {
		dao.add();
	}

}
