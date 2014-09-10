package com.sap.belajar.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.sap.belajar.domain.User;

public interface UserDao extends PagingAndSortingRepository<User, String> {
	
	@Query("select u,r from User u "
			+ "left join u.role r "
			+ "where u.id = :id")
	User findWithRoleById(@Param("id")Integer id);

}
