package com.springmvc2.demo.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc2.demo.TaskSystemDAO;
import com.springmvc2.demo.model.Task;
import com.springmvc2.demo.model.User;

@RestController
public class TaskRestConroller {
	@Autowired
	TaskSystemDAO taskSystemDAOImpl;
	@GetMapping("/gettaskdetails/{tid}")
	public Task getTask(@PathVariable int tid)throws SQLException {
	
	return taskSystemDAOImpl.getTask(tid);
	}
	
	@GetMapping("/getalltaskdetails/{status}")
	public List<Task> getAllTasks(@PathVariable String status)throws SQLException {
	
	return taskSystemDAOImpl.getAllTasks(status);
	}
	
	@PutMapping("/assignTask/{taskid}/{ownerid}")
	public int updateOwnerid(@PathVariable int taskid,@PathVariable int ownerid)throws SQLException {
	
	return taskSystemDAOImpl.assignOwner(taskid,ownerid);
	}
	
	@PostMapping("/addTask")
	public ResponseEntity<Task> addTask(@RequestBody Task task)throws SQLException {
	
	taskSystemDAOImpl.addTask(task);
	return new ResponseEntity<Task>(task,HttpStatus.OK);
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user)throws SQLException {
	
	taskSystemDAOImpl.addUser(user);
	return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	
	@GetMapping("/assignpriority/{taskid}/{priority}")
	public int updatepriority(@PathVariable int taskid,@PathVariable String priority)throws SQLException {
	
	return taskSystemDAOImpl.assignpriority(taskid,priority);
	}
	@GetMapping("/assignnote/{taskid}/{notes}")
	public int updatenotes(@PathVariable int taskid,@PathVariable String notes)throws SQLException {
	
	return taskSystemDAOImpl.assignnotes(taskid,notes);
	}
	@GetMapping("/restgetAlltask/{ownerid}")
	public List<Task> getAllTask(@PathVariable int ownerid) throws SQLException {

		return taskSystemDAOImpl.getAllTask(ownerid);
	}
	

}
