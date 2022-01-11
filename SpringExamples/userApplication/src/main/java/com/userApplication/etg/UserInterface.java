package com.userApplication.etg;

import java.sql.SQLException;

import com.userApplication.etg.model.UserBean;

public interface UserInterface {
	public boolean addUser(UserBean user) throws SQLException;


}
