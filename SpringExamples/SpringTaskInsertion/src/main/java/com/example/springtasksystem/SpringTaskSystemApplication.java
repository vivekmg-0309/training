package com.example.springtasksystem;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springtasksystem.model.Task;
import com.example.springtasksystem.impl.TaskSystemDAOImpl;



@SpringBootApplication
public class SpringTaskSystemApplication {

	public static void main(String[] args)  {
		ApplicationContext ctx = SpringApplication.run(SpringTaskSystemApplication.class, args);
		TaskSystemDAO task=(TaskSystemDAO) ctx.getBean("taskSystemDAOImpl");
		Task t =  new Task();
		t.setTaskName("hoohoohoh");
		t.setOwnerId(502222);
	

		try {
			task.addTask(t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
		
		
	}


