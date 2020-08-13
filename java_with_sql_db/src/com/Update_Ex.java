package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Employee;
import com.model.Gender;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;

public class Update_Ex {

	public static void main(String[] args) {

		// using JDBC API

		try {

			// step-1 : register jdbc-driver
			DriverManager.registerDriver(new Driver());

			// step-2 : create database connection
			String url = "jdbc:mysql://localhost:3306/emp_db";
			String user = "root";
			String password = "root1234";
			Connection connection = DriverManager.getConnection(url, user, password);

			// step-3 : create SQL statement
			String sql = "update employee set salary=? where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setDouble(1, 10000.00);
			ps.setInt(2, 1);

			// step-4 : execute statement & process result
			int i = ps.executeUpdate();
			if (i == 1)
				System.out.println(" Employee updated..");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
