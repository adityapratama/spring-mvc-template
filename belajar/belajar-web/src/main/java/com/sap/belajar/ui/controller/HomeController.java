package com.sap.belajar.ui.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sap.belajar.domain.User;

@Controller
public class HomeController {
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	@ResponseBody
	public List<User> findUserAll(){
		return null;
	}
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	@ResponseBody
	public User findUserById(@PathVariable("id") Integer id){		
		return null;
	}
}
