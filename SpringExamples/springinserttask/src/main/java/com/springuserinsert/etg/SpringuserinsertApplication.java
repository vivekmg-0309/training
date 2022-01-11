package com.springuserinsert.etg;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringuserinsertApplication {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = SpringApplication.run(SpringuserinsertApplication.class, args);
		
	}

}