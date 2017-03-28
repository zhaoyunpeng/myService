package com.zyp.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zyp.Dao.UserMapper;
import com.zyp.model.User;

@Service("userService")
public class UserServiceImpl implements IUserService
{
	@Resource
	private UserMapper userDao;
	@Override
	public User getUserById(int id)
	{
		return this.userDao.selectByPrimaryKey(id);
	}
	
	@Override
	public void InsertUser(User user)
	{
		this.userDao.insert(user);
	}
}
