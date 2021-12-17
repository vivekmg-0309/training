package com.tasksystem.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tasksystem.dao.MySqlConnection;
import com.tasksystem.dao.TaskSystemDAO;
import com.tasksystem.model.Task;

public class TaskSystemDAOImpl implements TaskSystemDAO {
	@Override
	public boolean addTask(Task task) throws SQLException {
		boolean flag = false;
		MySqlConnection con  =  new  MySQLConnectionImpl();
		Connection c = con.getConnection();
		String sql = "insert into tasktable (taskId,Name,OwnerId) values(?,?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setInt(1, task.getTaskId());
		st.setString(2, task.getName());
		st.setInt(3, task.getOwnerId());
		int r = st.executeUpdate();
		return true;
	}

}
