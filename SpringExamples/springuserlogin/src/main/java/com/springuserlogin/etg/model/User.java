package com.springuserlogin.etg.model;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	private int userid;
	private String username;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	

}
