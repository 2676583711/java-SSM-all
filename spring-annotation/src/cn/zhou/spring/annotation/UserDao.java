package cn.zhou.spring.annotation;

import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao {

	public void test() {
		System.out.println("dao..............");
	}
}
