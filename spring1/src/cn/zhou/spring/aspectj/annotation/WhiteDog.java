package cn.zhou.spring.aspectj.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class WhiteDog {

	@Before(value="execution(* cn.zhou.spring.aspectj.annotation.Dog.*(..))")
	public void white() {
		System.out.println("white");
	}
}
