package com.userApplication.etg.impl;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.userApplication.etg.MySQLConnection;
import com.userApplication.etg.UserInterface;
import com.userApplication.etg.model.UserBean;

@Component
public class UserImpl implements UserInterface {
	@Autowired
	MySQLConnection mySQLConnectionImpl;
	
	
	@Override
	public boolean addUser(UserBean user) throws SQLException {
		boolean flag = false;
		//MySQLConnectionImpl con  =  new  MySQLConnectionImpl();
		//Connection c = con.getConnection();
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