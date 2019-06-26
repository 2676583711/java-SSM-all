package cn.zhou.spring.jdbctemplate.annotation;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

	/*
	 * 实体类的创建交给spring完成
	 */
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int add() {

		String sql = "insert into spring_user values(?,?)";
		int i = jdbcTemplate.update(sql, "tompson", "j37149");

		return i;

	}
}
