package com.sonata.JobTracker.Dao;


import java.sql.SQLException;
import java.util.List;

import com.sonata.JobTracker.Model.Task;
import com.sonata.JobTracker.Model.User;

public interface JobTrackerDao {
	public boolean addTask(Task task) throws SQLException;
	public boolean addUser(User user) throws SQLException;
	public List<Task> getAllTasks() throws SQLException;
	public List<Task> getAllTasksByStatus(String status) throws SQLException;
	public List<Task> getAllTasksByOwner(String status) throws SQLException;
	public int updateTaskStatus(int taskid, String status);
	public int updateTaskPriority(int taskid, String priority);
	public int updateTaskNotes(int taskid, String Notes);
	public int updateTaskBookmark(int taskid, String bookmark);
	public int assignTaskUser(int taskid, int ownerid);
	public void transactionDemo() throws SQLException;
	public int storeimage(String path) throws SQLException;
	public int[] batachDemo() throws SQLException;

}
