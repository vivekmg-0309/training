package com.userApplication.etg;

import java.sql.SQLException;
import java.util.List;

import org.springframework.scheduling.config.Task;

import com.userApplication.etg.model.User;

public interface LoginInterface {
	public boolean  validateUser(User u ) throws SQLException;

	
}
