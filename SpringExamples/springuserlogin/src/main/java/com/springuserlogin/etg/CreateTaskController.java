package com.springuserlogin.etg;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springuserlogin.etg.impl.LoginImpl;
import com.springuserlogin.etg.model.Task;


@RestController
public class CreateTaskController {
	
    	@Autowired
		LoginImpl loginImpl;
    	
    	
    	@PostMapping("/createaddtask")
    	public ResponseEntity<Task> addTask(@RequestBody Task task) throws SQLException {
    	loginImpl.addTask(task);
    	return new ResponseEntity<Task>(task,HttpStatus.OK);
    	}

}
