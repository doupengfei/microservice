package com.dpf.service;

import java.util.List;
import java.util.Map;

import com.dpf.beans.Users;

public interface IUserService {
	void addUser(Users user);

	void updateUser(Users user);

	void delteUser(Integer userId);

	List<Users> listUser();

	Users loadUsersById(Integer userId);
	
	/**
	 * 获取信息
	 * @return
	 */
	Map<String,Object> getInfo();
}
