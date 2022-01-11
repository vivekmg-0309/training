package com.tasksystem.etg;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tasksystem.dao.MySqlConnection;
import com.tasksystem.dao.TaskSystemDAO;
import com.tasksystem.dao.impl.MySQLConnectionImpl;
import com.tasksystem.dao.impl.TaskSystemDAOImpl;
import com.tasksystem.model.Task;

@SpringBootApplication
public class TaskSystemApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(SpringBootApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SpringBootApplication.class, args);

		TaskSystemDAO task=(TaskSystemDAO) ctx.getBean("TaskSystemDAOImpl");
		
		Task t = new Task();
		t.setTaskName("hihlo");
		t.setOwnerId(5012);

		try {
		task.addTask(t);
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
}



