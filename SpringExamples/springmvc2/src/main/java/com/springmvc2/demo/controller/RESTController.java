package com.springmvc2.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc2.demo.model.Task;

@RestController
public class RESTController {
	@GetMapping("/resthello")
	public String getHello() {
	return "Hello How are you";
	}

	@GetMapping("/resttask")
	public Task getTask() {
	Task task = new Task();
	task.getStatus();
	task.getCreatedOn();
	task.getCreatorId();
	task.getIsBookmarked();
	task.getName();
	task.getNotes();
	task.getOwnerId();
	return task;
	}
	@GetMapping("/resttasks")
	public List<Task> getTasks() {
	List<Task> list = new ArrayList<Task>();
	Task task = new Task();
	task.setOwnerId(56);
	task.setTaskId(78);
	task.setName("Create REST Service");
	task.setStatus("completed");
	
	list.add(task);
	task.setOwnerId(56);
	task.setTaskId(78);
	task.setName("Create Task Service");
	list.add(task);
	return list;
	}
}
