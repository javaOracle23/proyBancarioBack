package com.banco.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.apirest.models.entity.User;



@Repository
public interface UserDao extends JpaRepository<User, Long> {

	User findByUserName(String paramUserName);
	
	User findByUserNameAndPassword(String paramUserName,String paramPassword);
	
}
