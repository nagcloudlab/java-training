package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Employee;
import com.model.Gender;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;

public class Insert_Ex {

	public static void main(String[] args) {

		Employee employee = new Employee(2, "Indu", 1000.00, Gender.FEMALE);
//		

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
			String sql = "insert into employee values(?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setDouble(3, employee.getSalary());
			ps.setString(4, employee.getGender().name());

			// step-4 : execute statement & process result
			int i = ps.executeUpdate();
			if (i == 1)
				System.out.println("New Employee saved");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
