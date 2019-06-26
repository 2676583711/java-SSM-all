package cn.zhou.spring;

public class User {
	private String username;

	public User() {

	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User(String username) {
		this.username = username;
	}

	public static void add() {
		System.out.println("add....");
	}

	public static void main(String[] args) {
		add();
	}

	public void test() {
		System.out.println(username);
	}
}
