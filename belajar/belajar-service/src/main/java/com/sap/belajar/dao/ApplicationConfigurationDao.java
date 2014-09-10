package com.sap.belajar.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sap.belajar.domain.ApplicationConfiguration;

public interface ApplicationConfigurationDao extends PagingAndSortingRepository<ApplicationConfiguration, String> {
}
