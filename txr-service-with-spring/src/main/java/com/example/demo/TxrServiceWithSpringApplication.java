package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableTransactionManagement
public class TxrServiceWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TxrServiceWithSpringApplication.class, args);
	}

}
