package cn.zhou.spring.annotation;

import org.springframework.stereotype.Component;

@Component("userService")
public class UserService {

	
	public void test() {
		System.out.println("userservice..........");
	}
}
