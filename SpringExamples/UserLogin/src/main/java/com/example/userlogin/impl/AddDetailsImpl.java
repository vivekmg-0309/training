package com.example.userlogin.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.userlogin.AddDetailsInterface;
import com.example.userlogin.MySQLConnection;


@Component
public class AddDetailsImpl implements AddDetailsInterface {
	
	@Autowired
	MySQLConnectionImpl mySQLConnectionImpl;
	

	@Override
	public boolean addTask(String username, String password) throws SQLException {
		
		   
	     boolean flag = false;
	  
	       
			Connection c = mySQLConnectionImpl.getConnection();
			System.out.println(c);
			String sql = "insert into taskde (taskname,description) values(?,?)";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, username);
			st.setString(2, password);
			int r = st.executeUpdate();
			if (r >0)
				return true;
			else 
				return false;
		}

	}