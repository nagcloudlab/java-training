package com.example.repository;

import java.sql.SQLException;

import com.example.model.Account;

public interface AccountRepository {

	Account loadAccount(String num) throws SQLException;

	Account updateAccount(Account account) throws SQLException;

}
