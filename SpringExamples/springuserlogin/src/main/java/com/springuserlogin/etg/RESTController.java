package com.springuserlogin.etg;

import java.util.ArrayList;
import java.util.List;
import com.springuserlogin.etg.model.Task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

	@GetMapping("/resthello")
	public String getHello() {
	return "Hello How are you";
	}
	
	@GetMapping("/resttasks")
	public List<Task> getTasks() {
	List<Task> list = new ArrayList<Task>();
	Task task = new Task();
	task.setTaskId(1000);
	task.setTaskName("Create REST Service");
	list.add(task);
	task.setTaskId(1001);
	(task).setTaskName("Create Task Service");
	list.add(task);
	return list;
	}
}
