package com.sap.belajar.controller.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sap.belajar.domain.ApplicationConfiguration;
import com.sap.belajar.service.ApplicationService;

@Controller
public class ApplicationController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);
	
	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping(value ="/api/config", method = RequestMethod.GET)
    @ResponseBody
	public List<ApplicationConfiguration> findAll(Pageable pageable){
		ApplicationController.LOGGER.info("Api Application Controller");
		
		List<ApplicationConfiguration> applicationConfigurations = this.applicationService.findAllApplicationConfiguration(pageable).getContent();
		return applicationConfigurations;
	}
}
