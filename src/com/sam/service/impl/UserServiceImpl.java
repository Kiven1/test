package com.sam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.UserMapper;
import com.sam.pojo.User;
import com.sam.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findByUname(String uname) {
		User user = userMapper.findByUname(uname);
		return user;
	}

}
