package com.dpf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dpf.beans.Users;
@Mapper
public interface UsersMapper {
	void addUser(Users user);

	void updateUser(Users user);

	void delteUser(Integer userId);

	List<Users> listUser();

	Users loadUsersById(Integer userId);
}
