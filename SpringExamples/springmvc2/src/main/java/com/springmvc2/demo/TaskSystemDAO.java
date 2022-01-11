package com.springmvc2.demo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springmvc2.demo.model.Task;
import com.springmvc2.demo.model.User;

@Component
public interface TaskSystemDAO {
	public boolean addTask(Task task) throws SQLException;
	public boolean addUser(User user) throws SQLException;
    public Task getTask(int taskid);
    public List<Task> getAllTasks(String taskstatus);
    public int assignOwner(int taskid,int ownerid);
    public int assignpriority(int taskid,String priority);
    public int assignnotes(int taskid,String notes);
    public List<Task> getAllTask(int ownerid);
	
	
}
