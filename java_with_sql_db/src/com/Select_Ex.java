package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.model.Gender;
import com.mysql.jdbc.Driver;

public class Select_Ex {

	public static void main(String[] args) {

		// using JDBC API

		List<Employee> employees=new ArrayList<Employee>();
		
		try {

			// step-1 : register jdbc-driver
			DriverManager.registerDriver(new Driver());

			// step-2 : create database connection
			String url = "jdbc:mysql://localhost:3306/emp_db";
			String user = "root";
			String password = "root1234";
			Connection connection = DriverManager.getConnection(url, user, password);

			// step-3 : create SQL statement
			String sql = "select * from employee where gender=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setNString(1, Gender.MALE.name());

			// step-4 : execute statement & process result
			ResultSet rs= ps.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3),Gender.valueOf(rs.getString(4)));
				employees.add(employee);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		employees
		.forEach(System.out::println);

	}

}
