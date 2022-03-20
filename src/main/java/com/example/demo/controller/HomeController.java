package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController<UserRepository> {

	@Autowired(required=true)
	private UserService userService;

	@GetMapping("/")
	public String showForm(@ModelAttribute("user") User user) {
		return "home";
	}

	@GetMapping("/show")
	public ModelAndView showUsers() {
		List<User> userList = userService.findAllUser();
		ModelAndView mv = new ModelAndView("users");
		mv.addObject("users", userList);
	    return mv;
	}
}
