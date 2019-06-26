package cn.zhou.spring.transaction.annotation;

import org.springframework.jdbc.core.JdbcTemplate;

//import com.mchange.v2.c3p0.ComboPooledDataSource;

public class MoneyDao {
	
	
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	
	public void less() {
		
//		ComboPooledDataSource c=new ComboPooledDataSource();
//		c.setDriverClass(driverClass);
//		c.setJdbcUrl(jdbcUrl);
//		c.setUser(user);
//		c.setPassword(password);
		
		String sql = "update money set money=money-? where name=?";
		
		jt.update(sql, 100, "tom");

	}

	public void more() {
		String sql = "update money set money=money+? where name=?";
		jt.update(sql, 100, "jimy");
	}

}
