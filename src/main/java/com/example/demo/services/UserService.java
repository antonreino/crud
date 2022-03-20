package com.example.demo.services;

import com.example.demo.entity.User;

import java.util.List;


public interface UserService {

	List<User> findAllUser();
	User findUserByUsernameAndPassword(String user, String pass);
}
