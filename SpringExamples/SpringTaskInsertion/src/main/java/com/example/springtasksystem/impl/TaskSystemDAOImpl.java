package com.example.springtasksystem.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springtasksystem.TaskSystemDAO;
import com.example.springtasksystem.model.Task;



@Component
public class TaskSystemDAOImpl implements TaskSystemDAO {

	
	@Autowired
	MySQLConnectionImpl mySQLConnectionImpl;
	
	
	@Override
	public boolean addTask(Task task) throws SQLException {
		boolean flag = false;
		//MySqlConnection con  =  new  MySQLConnectionImpl();
		Connection c =mySQLConnectionImpl.getConnection();
		String sql = "insert into task (taskid,taskname,Ownerid) values(?,?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setInt(1, task.getTaskId());
		st.setString(2, task.getTaskName());
		st.setInt(3, task.getOwnerId());
		int r = st.executeUpdate();
		if (r >0)
			return true;
		else 
			return false;
	}
	}

