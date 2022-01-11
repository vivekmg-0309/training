package com.springuserinsert.etg.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springuserinsert.etg.MySQLConnection;
import com.springuserinsert.etg.UserInterface;
import com.springuserinsert.etg.model.UserBean;

@Component
public class UserImpl implements UserInterface {
	@Autowired
	MySQLConnection mySQLConnectionImpl;
	
	@Override
	public boolean addUser(UserBean user) throws SQLException {
		boolean flag = false;
		Connection con =mySQLConnectionImpl.getConnection();
		String sql = "insert into task (taskname,ownerid,creatorid) values(?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, user.getName());
		st.setLong(2, user.getOwnerId());
		st.setInt(3, user.getCreatorid());
		int r = st.executeUpdate();
		if (r >0)
			return true;
		else 
			return false;
		
		
	}


	



	}