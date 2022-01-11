package com.example.springtasksystem;

import java.sql.SQLException;

import com.example.springtasksystem.model.Task;

public interface TaskSystemDAO {

	public boolean addTask(Task task) throws SQLException;

	

	

}
