package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class MySQLConnectionFactory {

	public static Connection getConnection() throws SQLException {

		DriverManager.registerDriver(new Driver());

		String url = "jdbc:mysql://localhost:3306/bank_db";
		String user = "root";
		String password = "root1234";
		Connection connection = DriverManager.getConnection(url, user, password);

		return connection;

	}

}
