package com.hemant.struts2demo.service;

import com.hemant.struts2demo.model.User;

public class LoginService {
	
	public boolean verifyuser(User user) {
		if (user.getUserId().equals("user") && user.getPassword().equals("password")) {
			return true;
		}
		return false;
	}
}
