package com.banco.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.apirest.models.dao.UserDao;
import com.banco.apirest.models.entity.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public User save(User user){	
        return userDao.save(user);
    }
	
	public User findByUserName(String paramUserName){
        return userDao.findByUserName(paramUserName);
    }
    
	public User findByUserNameAndPassword(String paramUserName,String paramPassword){
        return userDao.findByUserNameAndPassword(paramUserName,paramPassword);
    }
	
	
	
	
}
