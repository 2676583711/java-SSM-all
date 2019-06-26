package cn.zhou.json_lib;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonLib {

	/*
	 * json-lib
	 * 
	 * JSONObject父类是map 比map多了一个tostring方法
	 * 
	 * fromobject方法可以把其他对象转换成jsonobject对象
	 */

	@Test
	public void test1() {
		JSONObject map = new JSONObject();
		map.put("name", "namevalue");
		map.put("age", "agevalue");
		System.out.println(map);

		System.out.println(map.toString());
	}

	/*
	 * jsonarray
	 */
	@Test
	public void test2() {
		List list = new ArrayList();
		list.add("name");
		list.add("age");

		JSONArray ja = new JSONArray();

		List s = ja.fromObject(list);

		System.out.println(ja.toString());
		System.out.println(s);

		System.out.println(JSONArray.fromObject(list));
	}

}
