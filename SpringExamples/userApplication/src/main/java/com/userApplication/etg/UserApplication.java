package com.userApplication.etg;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.userApplication.etg.model.User;
import com.userApplication.etg.model.UserBean;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = SpringApplication.run(UserApplication.class, args);
		LoginInterface l=(LoginInterface) ctx.getBean("loginImpl");
		User u =new User();
		u.setUsername("hi");
		u.setPassword("hlo");
		l.validateUser(u) ;
		
		UserInterface user=(UserInterface) ctx.getBean("userImpl");
		UserBean u1=new UserBean();
		u1.setName("ggggggggggg");
		user.addUser(u1);
		
	}

}