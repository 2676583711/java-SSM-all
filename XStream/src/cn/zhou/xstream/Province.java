package cn.zhou.xstream;

import java.util.ArrayList;
import java.util.List;

public class Province {
	private String name;
	private List<City> list = new ArrayList<City>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getList() {
		return list;
	}

	public void setList(List<City> list) {
		this.list = list;
	}

	public Province(String name, List<City> list) {
		super();
		this.name = name;
		this.list = list;
	}

	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addCity(City city) {

		list.add(city);

	}

}
