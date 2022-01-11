package com.example.userlogin.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.userlogin.LoginInterface;
import com.example.userlogin.MySQLConnection;

@Component
public class LoginImpl implements LoginInterface {
	
	@Autowired
	MySQLConnection mySQLConnectionImpl;

	@Override
	public boolean validateUser(String username, String password) throws SQLException {
		
		boolean st =false;
		 try {
	        	
	        	Connection c = (Connection) mySQLConnectionImpl.getConnection();
	        	System.out.println(c);
	    		String sql = "select password from uselogin where username=? ";

	    		PreparedStatement ps = c.prepareStatement(sql);
	            
	            
				
	            ps.setString(1, username);
	      
	            ResultSet rs =(ResultSet) ps.executeQuery();
	            st = rs.next();
	            if( rs.getString("password").equals(password))
	    			    {
	    			    return true;
	    			    }else
	    			    {
	    			    return false;
	    			    }
		   }
	        catch(Exception e) {
	            e.printStackTrace();
	        }
	        return st;  
		}

	}
		 
		 
	




