package cn.zhou.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class SingleDog {

	public void test() {
		System.out.println("single...........");
	}

	public void after1() {
		System.out.println("after....");
	}

	public void after2() {
		System.out.println("after...222222");
	}

	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("环绕之前");

		proceedingJoinPoint.proceed();
		System.out.println("环绕之后");

	}
}
