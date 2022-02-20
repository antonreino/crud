package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Controller
public class HomeController<UserRepository> {

	@Autowired(required=true)
	private UserRepository userService;

	@GetMapping("/")
	public String showForm() {
		return "home";
	}

	@GetMapping("/show")
	public ModelAndView showUsers() {
		List<User> userList = userService.findAll();
		ModelAndView mv = new ModelAndView("users");
		mv.addObject("users", userList);
	    return mv;
	}
}
