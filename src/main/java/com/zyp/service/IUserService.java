package com.zyp.service;

import com.zyp.model.User;

public interface IUserService 
{
	public User getUserById(int userId);
	
	public void InsertUser(User user);
}
