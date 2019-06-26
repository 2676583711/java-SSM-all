package cn.zhou.xstream;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.thoughtworks.xstream.XStream;

public class Demo {

	public List getList() {

		Province p = new Province();
		p.setName("武汉");
		p.addCity(new City("武汉区", "wuhanqu"));
		p.addCity(new City("武昌区", "wuchangqu "));

		List<Province> list = new ArrayList<Province>();
		list.add(p);
		return list;
	}

	/*
	 * <list> <cn.zhou.xstream.Province> <name>武汉</name> <list>
	 * <cn.zhou.xstream.City> <name>武汉区</name> <description>wuhanqu</description>
	 * </cn.zhou.xstream.City> <cn.zhou.xstream.City> <name>武昌区</name>
	 * <description>wuchangqu </description> </cn.zhou.xstream.City> </list>
	 * </cn.zhou.xstream.Province> </list>
	 * 
	 */
	@Test
	public void test1() {

		List<Province> list = getList();
		XStream xs = new XStream();
		String s = xs.toXML(list);
		System.out.println(s);
	}

	/*
	 * <china> <province> <name>武汉</name> <list> <city> <name>武汉区</name>
	 * <description>wuhanqu</description> </city> <city> <name>武昌区</name>
	 * <description>wuchangqu </description> </city> </list> </province> </china>
	 * 
	 */
	@Test
	public void test2() {

		List<Province> list = getList();
		XStream xs = new XStream();
		xs.alias("china", List.class); // 更换xml标签的别名
		xs.alias("province", Province.class);
		xs.alias("city", City.class);
		String s = xs.toXML(list);
		System.out.println(s);
	}

	/*
	 * 去除无用标签 <china> <province> <name>武汉</name> <city> <name>武汉区</name>
	 * <description>wuhanqu</description> </city> <city> <name>武昌区</name>
	 * <description>wuchangqu </description> </city> </province> </china>
	 */
	@Test
	public void test3() {

		List<Province> list = getList();
		XStream xs = new XStream();
		xs.alias("china", List.class); // 更换xml标签的别名
		xs.alias("province", Province.class);
		xs.alias("city", City.class);

		xs.addImplicitCollection(Province.class, "list");
		String s = xs.toXML(list);
		System.out.println(s);
	}

	
	/*
	 * 去除description标签
	 * 使其不生成xml文档
	 <china>
  		<province>
		    <name>武汉</name>
		    <city>
		      <name>武汉区</name>
		    </city>
		    <city>
		      <name>武昌区</name>
		    </city>
	    </province>
    </china>
 
	 */
	@Test
	public void test4() {

		List<Province> list = getList();
		XStream xs = new XStream();
		xs.alias("china", List.class); // 更换xml标签的别名
		xs.alias("province", Province.class);
		xs.alias("city", City.class);

		xs.addImplicitCollection(Province.class, "list");

		xs.omitField(City.class, "description");
		String s = xs.toXML(list);
		System.out.println(s);
	}
}
