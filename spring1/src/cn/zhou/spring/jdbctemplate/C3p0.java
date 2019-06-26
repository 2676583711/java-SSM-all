package cn.zhou.spring.jdbctemplate;

import java.beans.PropertyVetoException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0 {

	public void createC3p0() throws PropertyVetoException {
		/*
		 * 创建数据库连接池
		 */
		ComboPooledDataSource cpds = new ComboPooledDataSource();

		cpds.setDriverClass("");
		cpds.setJdbcUrl("");
		cpds.setUser("");
		cpds.setPassword("");

	}
}
