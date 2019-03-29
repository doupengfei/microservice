package com.dpf.beans;

public class Users {
	private Integer userId;
	private String userName;
	private String logName;
	private String email;
	private String phone;

	public Users() {

	}

	public Users(Integer userId, String userName, String logName, String email, String phone) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.logName = logName;
		this.email = email;
		this.phone = phone;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
