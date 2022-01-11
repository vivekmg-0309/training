package com.springuserlogin.etg.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springuserlogin.etg.LoginInterface;
import com.springuserlogin.etg.MySQLConnection;
import com.springuserlogin.etg.model.Task;
import com.springuserlogin.etg.model.User;

@Component
public class LoginImpl implements LoginInterface {
	@Autowired
	MySQLConnection mySQLConnectionImpl;
	@Override
	public boolean validateUser(String username,  String password) throws SQLException{
		boolean st =false;
		try {
			Connection con =mySQLConnectionImpl.getConnection();
			System.out.println(con);
			String sql="SELECT password FROM uselogin where username=?";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs =(ResultSet) ps.executeQuery();
            st=rs.next();
            if(rs.getString("password").equals(password))
            		{
            	return true;
            		}else {
            			return false;
            		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return st;
	}
	
	@Override
public Task getTask(int taskid) {
		Connection con =mySQLConnectionImpl.getConnection();
		Task task = new Task();
		try {
			String sql = "SELECT * FROM demo.task where taskid = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, taskid);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				task.setTaskId(rs.getInt("taskid"));
			}
			con.close();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return task;
	}
	
     @Override
	public int assignOwner(int taskid, int ownerid) {
    	 Connection con =mySQLConnectionImpl.getConnection();
    	 int rows=0;
    	 try {
    		 String sql = "update task set  taskid = ?  where ownerid = ?  ";
    		 PreparedStatement st = con.prepareStatement(sql);
    		 st.setInt(2, taskid);
    		 st.setInt(1, ownerid);
    		 rows = st.executeUpdate();
    		 con.close();
    	 }
    	 catch (SQLException e) {
    		 System.out.println(e.getMessage());
    	 }
		return rows;
	}
     @Override
	public boolean  addTask(Task task) throws SQLException {
    	 Connection con = mySQLConnectionImpl.getConnection();
    	 String sql = "insert into task (taskid,taskname,know,status,priority,notes,bookmark,ownerid) values(?,?,?,?,?,?,?,?)";
    	 PreparedStatement st = con.prepareStatement(sql);
    	 st.setInt(1, task.getTaskId());
    	 st.setString(2, task.getTaskName());
    	 st.setString(3, task.getKnow());
    	 st.setString(4, task.getStatus());
    	 st.setString(5, task.getPriority());
    	 st.setString(6, task.getNotes());
    	 st.setString(7, task.getBookmark());
    	 st.setInt(8, task.getOwnerId());
    	 
    	 int r = st.executeUpdate();
    	 if (r>0)
    	 {
		return true;
    	 }
     
		else {
			return false;
			
		}
	}

	@Override
	public int setpriority(int taskid , String priority) {
	  	 Connection con =mySQLConnectionImpl.getConnection();
    	 int rows=0;
    	 try {
    		 String sql = "update task set  priority = ?  where taskid = ?  ";
    		 PreparedStatement st = con.prepareStatement(sql);
    		 st.setInt(2, taskid);
    		 st.setString(1, priority);
    		 rows = st.executeUpdate();
    		 con.close();
    	 }
    	 catch (SQLException e) {
    		 System.out.println(e.getMessage());
    	 }
		return rows;
     }
	
	@Override
	public List<Task> getAllTask() {
		Connection con = mySQLConnectionImpl.getConnection();
		List<Task> tasklist= new ArrayList<Task>();
		try {
			String sql = "select * from task  ";
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Task  task= new Task();
				task.setCreatedOn(rs.getDate("createdon"));
				task.setCreatorId(rs.getInt("creatorid"));
				task.setDescription(rs.getString("description"));
				task.setBookmark(rs.getString("bookmark"));
				task.setNotes(rs.getString("notes"));
				task.setOwnerId(rs.getInt("ownerid"));
				task.setPriority(rs.getString("priority"));
				task.setStatus(rs.getString("status"));
				task.setTaskName(rs.getString("taskname"));
				task.setTaskId(rs.getInt("taskid"));
				tasklist.add(task);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return tasklist;

	}

    @Override
	public boolean  addUser(User user) throws SQLException {
   	 Connection con = mySQLConnectionImpl.getConnection();
   	 String sql = "insert into user (userid, username) values(?,?)";
   	 PreparedStatement st = con.prepareStatement(sql);
   	 st.setInt(1, user.getUserid());
   	 st.setString(2, user.getUsername());
   	 int r = st.executeUpdate();
   	 if (r>0)
   	 {
		return true;
   	 }else
   	 {
		return false;
			
		}
    }
     
    @Override
	public int addNote(int taskid, String notes) {
		Connection con =mySQLConnectionImpl.getConnection();
   	 int rows=0;
   	 try {
   		 String sql = "update task set  notes = ?  where taskid = ?  ";
   		 PreparedStatement st = con.prepareStatement(sql);
   		 st.setInt(2, taskid);
   		 st.setString(1,notes);
   		 rows = st.executeUpdate();
   		 con.close();
   	 }
   	 catch (SQLException e) {
   		 System.out.println(e.getMessage());
   	 }
		return rows;
 
}
}


	
	
