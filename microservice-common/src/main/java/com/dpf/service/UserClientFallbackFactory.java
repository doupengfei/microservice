package com.dpf.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.dpf.beans.Users;

import feign.hystrix.FallbackFactory;
@Component
public class UserClientFallbackFactory implements FallbackFactory<UserClientService> {

	@Override
	public UserClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new UserClientService() {

			@Override
			public List<Users> listUsers() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void updateUser(Users users) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void deleteUser(Integer userId) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Map<String, Object> getInfo() {
				Map<String,Object> map=new HashMap<String,Object>();
                map.put("code", 500);
                map.put("info", "系统出错，稍后重试");
                return map;
			}
			
			
		};
	}
	

}
