package cn.zhou.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class MyInterface {

	public static void main(String[] args) {

		/// sysout alt+/= System.out.println();

		System.out.println();
		System.out.println();
		System.out.println();
	}
}

/*
 * @Target 限定注解的使用范围 value= {ElementType.ANNOTATION_TYPE,
 * ElementType.CONSTRUCTOR, 注解只能使用在构造器上面 ElementType.FIELD, 字段，成员变量上面
 * ElementType.METHOD}) 只能使用在方法上面
 * 
 * 如果以上的值都同事存在则以上范围都可以使用
 * 
 */
@Target(value = { ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD,
		ElementType.TYPE

})
@interface mydemo {

}

/*
 * @Retention 可让注解被反射 默认的注解都仅仅存在于源码之中 使用@Retention(RetentionPolicy.RUNTIME)
 * 可以让注解也被解析(使用反射技术解析)
 */
@Retention(RetentionPolicy.RUNTIME)
@interface myannotation {

	int a(); // 注解的变量定义，名称之后必须加括号

}
