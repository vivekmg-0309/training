package com.springuserlogin.etg;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springuserlogin.etg.impl.LoginImpl;
import com.springuserlogin.etg.model.User;


@RestController
public class AddUserController {
	

	@Autowired
	LoginImpl loginImpl;
	
	@PostMapping("/createuser")
	public ResponseEntity<User> addTask(@RequestBody User user) throws SQLException {
	loginImpl.addUser(user);
	return new ResponseEntity<User>(user,HttpStatus.OK);
	}
}
