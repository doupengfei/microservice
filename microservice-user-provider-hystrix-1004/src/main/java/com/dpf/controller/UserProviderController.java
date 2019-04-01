package com.dpf.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dpf.beans.Users;
import com.dpf.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Controller
@RequestMapping("/user")
public class UserProviderController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void updateUser(@RequestBody Users user) {

		if (user.getUserId() == null) {
			userService.addUser(user);
		} else {
			userService.updateUser(user);
		}
	}

	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void deleteUser(@PathVariable Integer userId) {
		userService.delteUser(userId);
	}
	@RequestMapping(value = "/listUsers", method = RequestMethod.GET)
	@ResponseBody
	public List<Users> listUsers() throws InterruptedException {
		System.out.println("------------------1004-----------------------------------");
		return userService.listUser();
	}
	 /**
	 * 获取信息
	 * @return
	 * @throws InterruptedException 
	 */
	@ResponseBody
	@GetMapping(value="/getInfo")
	public Map<String,Object> getInfo() throws InterruptedException{
	    Thread.sleep(2000);
	    return userService.getInfo();
	}
	 
	 
	 
}
