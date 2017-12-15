package org.ssm.dufy.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.ssm.dufy.dao.UserDao;
import org.ssm.dufy.entity.User;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;
	
	@Override
	public User getUserById(int id) {
		User user = userDao.selectUserById(id);
		return user;
	}

}
