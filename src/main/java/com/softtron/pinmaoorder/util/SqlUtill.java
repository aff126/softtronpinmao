package com.softtron.pinmaoorder.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class SqlUtill {
//	@Value("${mysql.username}")
	private String username;
//	@Value("${mysql.password}")
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SqlUtill [username=" + username + ", password=" + password + "]";
	}
	
}
