package com.userloginexample.etg;

import java.sql.SQLException;

public interface LoginInterface {
	public boolean  validateUser(String username, String password) throws SQLException;

}