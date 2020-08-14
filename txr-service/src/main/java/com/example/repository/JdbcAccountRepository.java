package com.example.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.db.MySQLConnectionFactory;
import com.example.model.Account;
import com.mysql.jdbc.Driver;

public class JdbcAccountRepository implements AccountRepository {

	@Override
	public Account loadAccount(String num) throws SQLException {

		Connection connection = MySQLConnectionFactory.getConnection();
		String sql = "select * from accounts where num=?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, num);

		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			Account account = new Account();
			account.setNum(rs.getString(1));
			account.setBalance(rs.getDouble(2));
			return account;
		} else
			return null;
	}

	@Override
	public Account updateAccount(Account account) throws SQLException {

		Connection connection = MySQLConnectionFactory.getConnection();
		String sql = "update accounts set balance=? where num=?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setDouble(1, account.getBalance());
		ps.setString(2, account.getNum());

		ps.executeUpdate();

		return account;
	}

}
