package com.Expenses.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expenses.demo.dao.UserRoleDao;
import com.Expenses.demo.model.UserRole;

@Service
public class UserRoleService {
	
	private UserRoleDao dao;
	
	@Autowired
	public UserRoleService(UserRoleDao dao) {
		this.dao = dao;
	}
	
	public void addRoles() {
		dao.save(new UserRole(0, "Employee"));
		dao.save(new UserRole(0, "Finance Manager"));
	}

}
