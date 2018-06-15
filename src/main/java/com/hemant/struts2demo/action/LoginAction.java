package com.hemant.struts2demo.action;

import org.apache.commons.lang3.StringUtils;

import com.hemant.struts2demo.model.User;
import com.hemant.struts2demo.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * Default Serial ID
	 */
	private static final long serialVersionUID = 7100545000039168903L;
	
	private User user;
//	private String userId;
//	private String password;

	public void validate() {
		if (StringUtils.isEmpty(user.getUserId())) {
			// UserId is empty
			addFieldError("user.userId", "User ID cannot be blank");
		}

		if (StringUtils.isEmpty(user.getPassword())) {
			// Password is empty
			addFieldError("user.password", "Password cannot be blank");
		}
	}

	public String execute() {
		LoginService loginService = new LoginService();
	
		if (loginService.verifyuser(user)) {
			return SUCCESS;
		}
		return LOGIN;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
}
