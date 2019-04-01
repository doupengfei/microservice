package com.dpf.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dpf.beans.Users;
import com.dpf.mapper.UsersMapper;
import com.dpf.service.IUserService;

@Service
public class UserService implements IUserService {
    @Autowired
    private UsersMapper userMapper;
	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		userMapper.addUser(user);
	}

	@Override
	public void updateUser(Users user) {
		// TODO Auto-generated method stub
		userMapper.updateUser(user);
	}

	@Override
	public void delteUser(Integer userId) {
		// TODO Auto-generated method stub
		userMapper.delteUser(userId);
	}

	@Override
	public List<Users> listUser() {
		// TODO Auto-generated method stub
		return userMapper.listUser();
	}

	@Override
	public Users loadUsersById(Integer userId) {
		// TODO Auto-generated method stub
		return userMapper.loadUsersById(userId);
	}

	@Override
	public Map<String, Object> getInfo() {
		 Map<String,Object> map=new HashMap<String,Object>();
		    map.put("code", 200);
		    map.put("info", "业务数据xxxxx-1005");
		    return map;
	}
 
}
