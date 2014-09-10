package com.sap.belajar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sap.belajar.domain.ApplicationConfiguration;
import com.sap.belajar.domain.User;

public interface ApplicationService {
	Page<ApplicationConfiguration> findAllApplicationConfiguration(Pageable pageable);
	
	/*User*/
	User findUserWithRoleById(Integer id);
}
