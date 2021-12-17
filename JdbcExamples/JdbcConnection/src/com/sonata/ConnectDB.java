package com.sonata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class ConnectDB {
	
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgvivek","root","vivekmg");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM mgvivek.employee");
			
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				
			}
			
		}catch (Exception e) {System.out.println(e);}
		
		
	}

}
