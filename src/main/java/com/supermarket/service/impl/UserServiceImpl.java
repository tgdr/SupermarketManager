package com.supermarket.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.supermarket.dao.UserDao;
import com.supermarket.entity.User;
import com.supermarket.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	public User findByUserName(String userName) {
		return userDao.findByUserName(userName);
	}

	public List<User> findAll(Map<String, Object> map) {
		return userDao.findAll(map);
	}

	public Long count(Map<String, Object> map) {
		return userDao.count(map);
	}

	public Integer add(User user) {
		return userDao.add(user);
	}

	public Integer delete(Integer id) {
		return userDao.delete(id);
	}

	public Integer update(User user) {
		return userDao.update(user);
	}

	public Integer updateReset(Integer id) {
		return userDao.updateReset(id);
	}

	public User findRoleId(String userName) {
		return userDao.findRoleId(userName);
	}

}
