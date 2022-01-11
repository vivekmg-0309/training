package com.springuserlogin.etg;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springuserlogin.etg.impl.LoginImpl;
import com.springuserlogin.etg.model.Task;


@RestController
public class TaskRESTController {
	@Autowired
	LoginImpl loginImpl;
	
	@GetMapping("/taskdetails/{taskid}")
	public Task getTask(@PathVariable int taskid) throws SQLException{
		return loginImpl.getTask(taskid);
		
	}

}
