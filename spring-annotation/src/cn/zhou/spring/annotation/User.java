package cn.zhou.spring.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * 使用注解代替配置文件
 * @component 还有三个衍生注解
 * 如下：
 * @controller web层
 * @service  业务层
 * @repository 持久层
 * 
 * 这四个注解功能都一样（暂时）都可以创建对象
 * 
 * 
 * @scope(value="prototype")
 * 规定所创建的对象的是多实例prototype还是单实例simgle
 */

@Component(value = "user") // 相当于 <bean id="user" calss="cn.zhou.springannotation.User"></bean>
public class User {

	public void test() {
		System.out.println("annotation.......spring");
	}

	/*
	 * 使用注解注入对象属性
	 * 
	 * @Autowired
	 * 
	 * @Resource("对象名字")
	 */
	@Autowired
	private UserDao userDao;

	public void dao() {
		System.out.println("user....dao......" + userDao);
		userDao.test();
	}

	@Resource(name = "userService")
	private UserService userService;

	public void service() {
		System.out.println("user//...service");
		userService.test();
	}
}
