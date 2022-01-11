package com.springmvc2.demo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.mysql.cj.protocol.Resultset;
import com.springmvc2.demo.MySQLConnectionInterface;
import com.springmvc2.demo.TaskSystemDAO;
import com.springmvc2.demo.model.Task;
import com.springmvc2.demo.model.User;
@Component
public class TaskSystemDAOImpl implements TaskSystemDAO {
	@Autowired
	MySQLConnectionInterface mySQLConnectionImpl;
	
	@Override
	public Task getTask(int taskid) {
		Connection con =mySQLConnectionImpl.getConnection();
		Task task=new Task();
		try {
			String sql = "select * from tsk where tid=?";
			PreparedStatement st =  con.prepareStatement(sql);
			st.setInt(1,taskid);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				task.setTaskId(rs.getInt("tid"));
				task.setName(rs.getString("tname"));
				task.setOwnerId(rs.getInt("ownerid"));
				task.setNotes(rs.getString("notes"));
			}
			con.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return task;
}
	@Override
	public List<Task> getAllTasks(String taskstatus) {
		Connection con =mySQLConnectionImpl.getConnection();
		List<Task> task=new ArrayList<Task>();
		
		try {
			String sql = "select * from tsk where status=?";
			PreparedStatement st =  con.prepareStatement(sql);
			st.setString(1,taskstatus);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				Task task1=new Task();
				task1.setTaskId(rs.getInt("tid"));
				task1.setName(rs.getString("tname"));
				task1.setOwnerId(rs.getInt("ownerid"));
				task1.setNotes(rs.getString("notes"));
				task1.setStatus(rs.getString("status"));
				task.add(task1);
			}
			con.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return task;
	}
	@Override
	public int assignOwner(int taskid, int ownerid) {
		Connection con =mySQLConnectionImpl.getConnection();
		int rows=0;
		try {
			String sql = "update tsk set ownerid=? where tid=?";
			PreparedStatement st =  con.prepareStatement(sql);
			st.setInt(2,taskid);
			st.setInt(1,ownerid);
			rows=st.executeUpdate();
			con.close();
			}
		catch(SQLException e) {
			System.out.println(e.getMessage());
	}
		return rows;
	}
	@Override
	public boolean addTask(Task task)throws SQLException {
		
		Connection con =mySQLConnectionImpl.getConnection();
		
		
			String sql = "insert into tsk (tid,tname,description,status,ownerid) values (?,?,?,?,?)";
			PreparedStatement st =  con.prepareStatement(sql);
			st.setInt(1,task.getTaskId());
			st.setString(2, task.getName());
			st.setString(3, task.getDescription());
			st.setString(4, task.getStatus());
			st.setInt(5,task.getOwnerId()); 
			int r=st.executeUpdate();
			con.close();
			
		if(r>0) {
			
			return true;
		}
		else
		return false;
	}
	@Override
	public int assignpriority(int taskid, String priority) {
		Connection con =mySQLConnectionImpl.getConnection();
		int rows=0;
		try {
			String sql = "update tsk set priority=? where tid=?";
			PreparedStatement st =  con.prepareStatement(sql);
			st.setInt(2,taskid);
			st.setString(1,priority);
			rows=st.executeUpdate();
			con.close();
			}
		catch(SQLException e) {
			System.out.println(e.getMessage());
	}
		return rows;
	}
	@Override
	public int assignnotes(int taskid, String notes) {
		Connection con=mySQLConnectionImpl.getConnection();
		int rows=0;
		try {
			String sql = "update tsk set notes = ? where tid = ?";
			PreparedStatement st =  con.prepareStatement(sql);
			st.setInt(2,taskid);
			st.setString(1,notes);
			rows=st.executeUpdate();
			con.close();
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
	}
		return rows;
	}
	@Override
	public boolean addUser(User user) throws SQLException {
		Connection con =mySQLConnectionImpl.getConnection();
		
		
		String sql = "insert into users (userid,usename) values (?,?)";
		PreparedStatement st =  con.prepareStatement(sql);
		st.setInt(1,user.getUserId());
		st.setString(2, user.getUserName());
		 
		int r=st.executeUpdate();
		con.close();
		
	if(r>0) {
		
		return true;
	}
	else
	return false;
	}
	@Override
	public List<Task> getAllTask(int ownerid) {
		Connection con = mySQLConnectionImpl.getConnection();
		List<Task>  task= new ArrayList<Task>();
		try {
			String sql = "select * from tsk where ownerid=? ";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, ownerid);

			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				
				
				Task task1=new Task(); 
				
				task1.setDescription(rs.getString("description"));
				
				task1.setNotes(rs.getString("notes"));
				task1.setOwnerId(rs.getInt("ownerid"));
				task1.setPriority(rs.getString("priority"));
				task1.setStatus(rs.getString("status"));
				task1.setName(rs.getString("tname"));
				task1.setTaskId(rs.getInt("tid"));
				task.add(task1);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return task;

	}
}
