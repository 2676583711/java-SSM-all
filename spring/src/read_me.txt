 spring-4.3.9 入门案例
 
 	１．基本核心jar包
 	 commons-logging-1.1.3.jar
	 log4j-1.2.14.jar
	 spring-aop-4.3.9.RELEASE.jar
	 spring-beans-4.3.9.RELEASE.jar
	 spring-context-4.3.9.RELEASE.jar
	 spring-core-4.3.9.RELEASE.jar
	 spring-expression-4.3.9.RELEASE.jar
	 
　	２．配置文件 
　	 	一般取名为 bean.xml
　	 	 　xml文件约束:
　	 	 　<?xml version="1.0" encoding="UTF-8"?>
			<beans xmlns="http://www.springframework.org/schema/beans"
				xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
				xsi:schemaLocation="
				http://www.springframework.org/schema/beans 
				http://www.springframework.org/schema/beans/spring-beans.xsd">
				
				<中间进行相关配置>
				
			</beans>
				
				
	3.测试：
		//获取spring容器
	   ApplicationContext applicationContext = new ClassPathXmlApplicationContext(" 配置文件");
	   //根据配置的bean得到类实例
	   User user = (User) applicationContext.getBean("user");
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
