package com.springuserlogin.etg;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springuserlogin.etg.impl.LoginImpl;
import com.springuserlogin.etg.model.Task;

@RestController
public class FetchAllTaskController {
	@Autowired
	LoginImpl loginImpl;
	
	@GetMapping("/restgetAlltask")
	public List<Task> getAllTask() throws SQLException {

		return loginImpl.getAllTask();
	}




}
