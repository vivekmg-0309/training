package com.sonata.JobTracker.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.sonata.JobTracker.Model.Task;
import com.sonata.JobTracker.Model.User;

public class JobTrackerDaoImpl implements com.sonata.JobTracker.Dao.JobTrackerDao{

	@Override
	public boolean addTask(Task task) throws SQLException {
	  boolean added =false;
	  Connection conn = new MyConnectionImpl().connectToMySQL();
	  String sql = "insert into tasktable(Id,name,owner Id) VALUES (?,?,?)";
	  PreparedStatement pst = conn.prepareStatement(sql);
	  pst.setInt(1, task.getTaskId());
	  pst.setInt(2, task.getOwnerId());
	  pst.setString(3, task.getName());
	  int r = pst.executeUpdate();
	  pst.close();
	  conn.close();
	  if (r> 0)
		  added =  true;
	  return added;
	}

	@Override
	public boolean addUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Task> getAllTasks() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getAllTasksByStatus(String status) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getAllTasksByOwner(String status) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateTaskStatus(int taskid, String status) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTaskPriority(int taskid, String priority) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTaskNotes(int taskid, String Notes) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTaskBookmark(int taskid, String bookmark) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int assignTaskUser(int taskid, int ownerid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void transactionDemo() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int storeimage(String path) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] batachDemo() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public int save(Task t1) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Task> getData() {
		// TODO Auto-generated method stub
		return null;
	}

}
