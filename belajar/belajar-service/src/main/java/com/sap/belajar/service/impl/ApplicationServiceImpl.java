package com.sap.belajar.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sap.belajar.dao.ApplicationConfigurationDao;
import com.sap.belajar.dao.UserDao;
import com.sap.belajar.domain.ApplicationConfiguration;
import com.sap.belajar.domain.User;
import com.sap.belajar.service.ApplicationService;

@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService{
	
	@Autowired
	private ApplicationConfigurationDao applicationConfigurationDao;
	@Autowired
	private UserDao userDao;

	public Page<ApplicationConfiguration> findAllApplicationConfiguration(Pageable pageable) {
		return this.applicationConfigurationDao.findAll(pageable);
	}

	public User findUserWithRoleById(Integer id) {
		return this.userDao.findWithRoleById(id);
	}
}
