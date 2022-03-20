package com.example.demo.services;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Override
	public List<User> findAllUser() {
		System.out.println("USERREPOSITORY");
		return userRepository.findAll();
	}

	@Override
	public User findUserByUsernameAndPassword(String user, String pass) {
		return userRepository.findByUserAndPass(user,pass);
	}

}
