package com.springuserinsert.etg;

import java.sql.SQLException;

import com.springuserinsert.etg.model.UserBean;

public interface UserInterface {


	public boolean addUser(UserBean user) throws SQLException;

	

}
