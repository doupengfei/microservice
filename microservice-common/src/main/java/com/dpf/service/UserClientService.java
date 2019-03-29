package com.dpf.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dpf.beans.Users;

@FeignClient(value = "MICROSERVICE-USER")
public interface UserClientService {

	@GetMapping(value = "/user/listUsers")
	public List<Users> listUsers();

	@PostMapping(value = "/user/updateUser")
	public void updateUser(Users users);

	@GetMapping(value = "/user/deleteUser/{id}")
	public void deleteUser(@PathVariable("id") Integer userId);
}
