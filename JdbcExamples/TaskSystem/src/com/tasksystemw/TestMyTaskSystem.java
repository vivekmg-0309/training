package com.tasksystemw;

import java.sql.Connection;
import java.sql.SQLException;

import com.tasksystem.dao.MySqlConnection;
import com.tasksystem.dao.impl.MySQLConnectionImpl;
import com.tasksystem.dao.impl.TaskSystemDAOImpl;
import com.tasksystem.model.Task;
public class TestMyTaskSystem {
	public static void main(String[] args) {
		MySqlConnection con = new MySQLConnectionImpl();
		Connection c = con.getConnection();
		System.out.println(c);
		Task t =  new Task();
		t.setTaskId(2);
		t.setName("Create a DAO");
		t.setOwnerId(5000);
	
		try {
			new TaskSystemDAOImpl().addTask(t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
	}


}
