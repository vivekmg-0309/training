package com.sonata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PreparedSqlExample
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mgvivek","root","vivekmg");
			PreparedStatement ps = con.prepareStatement("insert into mgvivek.employee values (?,?,?)");
			ps.setInt(1, 5);
			ps.setString(2, "vicky");
			ps.setInt(3, 40000);
			int a = ps.executeUpdate();
			System.out.println("The number of records updated are " + a);
			
			
				}
		catch (ClassNotFoundException e1) {System.out.println(e1);}
				catch(SQLException e2) {e2.printStackTrace();}

}
}
