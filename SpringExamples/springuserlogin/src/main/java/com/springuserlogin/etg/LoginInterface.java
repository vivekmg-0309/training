package com.springuserlogin.etg;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Component;

import com.springuserlogin.etg.model.Task;


@Component
public interface LoginInterface {
	public boolean validateUser(String username, String password) throws SQLException;
	public Task getTask(int taskid);
	public int assignOwner(int taskid, int ownerid);
	public boolean addTask(Task task) throws SQLException;
	public int setpriority(int taskid, String priority);
	public List<Task> getAllTask();
	boolean addUser(com.springuserlogin.etg.model.User user) throws SQLException;
	public int addNote(int taskid, String notes);
	
}
