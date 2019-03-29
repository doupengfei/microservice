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
import org.springframework.web.client.RestTemplate;

import com.dpf.beans.Users;

@Controller
@RequestMapping("/user")
public class UserConsumerController {
	@Autowired
    private RestTemplate restTemplate;
	private final String PRE_HOST="http://MICROSERVICE-USER";
    
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void updateUser(@RequestBody Users user) {

		  restTemplate.postForObject(PRE_HOST+"/user/updateUser", user, Boolean.class);
	}

	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void deleteUser(@PathVariable Integer userId) {
		 restTemplate.getForObject(PRE_HOST+"/user/deleteUser/"+userId, Boolean.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/listUsers", method = RequestMethod.GET)
	@ResponseBody
	public List<Users> listUsers() {
		return restTemplate.getForObject(PRE_HOST+"/user/listUsers", List.class);
	}
	@SuppressWarnings("unchecked")
	@GetMapping(value="/getInfo")
	@ResponseBody
	public Map<String,Object> getInfo(){
	    return restTemplate.getForObject(PRE_HOST+"/user/getInfo/", Map.class);
	}
}
