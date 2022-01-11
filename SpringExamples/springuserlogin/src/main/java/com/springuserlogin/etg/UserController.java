package com.springuserlogin.etg;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@Autowired
	LoginInterface loginImpl;
	
	@RequestMapping("/")
	public String login (ModelMap map) {
		return "login";
	}

	
	
	@RequestMapping("/login")
	public String success(Model model, @RequestParam ("username") String username, @RequestParam("password") String password)throws SQLException
	{

	boolean t =loginImpl.validateUser(username,password );
	if (t==true) {
		System.out.println("valid user");
		return "success";
	}
	else {
		
		return "login";
		
	}
}
	
	


}
