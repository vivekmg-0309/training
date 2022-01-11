package com.example.userlogin;
import java.sql.SQLException;

public interface AddDetailsInterface {
	public boolean addTask(String username , String password) throws SQLException;

}
