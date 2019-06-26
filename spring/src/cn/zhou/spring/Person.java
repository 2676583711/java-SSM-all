package cn.zhou.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.core.convert.Property;

public class Person {

	private String[] arg;
	private List list;
	private Map map;

	private Properties p;

	
	public void setArg(String[] arg) {
		this.arg = arg;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

	public void setMap(HashMap hashMap) {
		this.map = hashMap;
	}

	public void setP(Properties p) {
		this.p = p;
	}

	public void test() {
		System.out.println("agr:" + arg);

		System.out.println("list:" + list);

		System.out.println("map:" + map);


		System.out.println("properties" + p);
		
	
	}
}
