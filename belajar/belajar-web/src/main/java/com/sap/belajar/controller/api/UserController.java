package com.sap.belajar.controller.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sap.belajar.domain.User;
import com.sap.belajar.service.ApplicationService;

@Controller
public class UserController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping(value ="/api/user/{id}", method = RequestMethod.GET)
    @ResponseBody
	public User findById(@PathVariable("id") Integer id){
		UserController.LOGGER.info("Api Application Controller");
		
		User user = this.applicationService.findUserWithRoleById(id);
		
		return user;
	}
}
