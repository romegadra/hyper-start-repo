package com.hyperion.training.basic.service;

import com.hyperion.training.basic.databaseconnector.JdbcConnection;
import com.hyperion.training.basic.databaseconnector.impl.JdbcConnectorImpl;

public class DbConnectionServiceImpl {

	JdbcConnection jdbcConn = new JdbcConnectorImpl();
	
	public void getConnection() {
		jdbcConn.getTransaction();
	}
}
