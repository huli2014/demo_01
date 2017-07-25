package com.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.user.UserMapper;
import com.model.user.User;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	
	public User selectUserById(Integer userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
}
