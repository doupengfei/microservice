package com.dpf.controller;

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
import com.dpf.service.UserClientService;

@Controller
@RequestMapping("/user")
public class UserConsumerController {
	@Autowired
    private UserClientService userClientService;
    
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void updateUser(@RequestBody Users user) {

		userClientService.updateUser(user);
	}

	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void deleteUser(@PathVariable Integer userId) {
		userClientService.deleteUser(userId);
	}

	@RequestMapping(value = "/listUsers", method = RequestMethod.GET)
	@ResponseBody
	public List<Users> listUsers() {
		return userClientService.listUsers();
	}
	@GetMapping(value="/getInfo")
	@ResponseBody
	public Map<String,Object> getInfo(){
	    return userClientService.getInfo();
	}
}
