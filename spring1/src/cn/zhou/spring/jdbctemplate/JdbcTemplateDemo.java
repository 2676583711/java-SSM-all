package cn.zhou.spring.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTemplateDemo {
	private static JdbcTemplate jt = null;
	static {
		DriverManagerDataSource dmds = new DriverManagerDataSource();

		dmds.setDriverClassName("com.mysql.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/zhou");
		dmds.setUsername("root");
		dmds.setPassword("zhou123");

		jt = new JdbcTemplate(dmds);

	}

	@Test
	public void add() {

		DriverManagerDataSource dmds = new DriverManagerDataSource();

		dmds.setDriverClassName("com.mysql.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/zhou");
		dmds.setUsername("root");
		dmds.setPassword("zhou123");

		JdbcTemplate jt = new JdbcTemplate(dmds);

		String sql = "insert into spring_user values(?,?)";

		int i = jt.update(sql, "username", "password");

		System.out.println(i);

	}

	@Test
	public void update() {

		// String sql = "truncate spring_user";

		String sql = "update  spring_user set password=? where username=?";

		int i = jt.update(sql, "110", "username");
		System.out.println(i);

	}

	@Test
	public void delete() {

		String sql = "delete from spring_user where username=?";
		int i = jt.update(sql, "username");
		System.out.println(i);

	}

	/*
	 * 查询记录数
	 */
	@Test
	public void search1() {

		String sql = "select count(*) from spring_user";
		int i = jt.queryForObject(sql, Integer.class);
		System.out.println(i);

	}

	/*
	 * 查询符合某个条件的所有记录 使用spring的jdbctemplate的查询操作 本方法spring仅仅封装了一部分 另外的部分需要自行实现一个接口
	 * RowMapper
	 * 
	 */
	@Test
	public void search2() {

		String sql = "select *from spring_user where username=? ";
		User user = jt.queryForObject(sql, new MyRowMapper(), "username");
		System.out.println(user);

	}

	/*
	 * 查询所有 返回list集合 同样需要自行实现rowmapper接口
	 */
	@Test
	public void search3() {
		String sql = "select *from spring_user";

		List<User> list = jt.query(sql, new MyRowMapper());

		System.out.println(list);

	}

}

class MyRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int i) throws SQLException {

		String username = rs.getString("username");
		String password = rs.getString("password");

		User user = new User();

		user.setUsername(username);
		user.setPassword(password);

		return user;
	}

}
