package cn.zhou.entity;

public class User {

	private int uid;
	// private String uid;

	private String username;
	private String password;
	private String address;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	/*
	 * public String getUid() { return uid; }
	 * 
	 * public void setUid(String uid) { this.uid = uid; }
	 */
	

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", address=" + address + "]";
	}

	public User(int uid, String username, String password, String address) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.address = address;
	}

	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
