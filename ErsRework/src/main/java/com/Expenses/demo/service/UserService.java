package com.Expenses.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expenses.demo.dao.UserDao;
import com.Expenses.demo.dao.UserRoleDao;
import com.Expenses.demo.model.User;

@Service
public class UserService {
	
	private UserDao userDao;
	private UserRoleDao roleDao;

	@Autowired
	public UserService(UserDao userDao, UserRoleDao roleDao) {
		this.userDao = userDao;
		this.roleDao = roleDao;
	}
	
	public User getAccount(User user) {
		User temp = userDao.findByErsUsername(user.getErsUsername());
		if(temp.getErsPassword().contentEquals(user.getErsPassword())) {
			return temp;
		}
		else {
			return null;
		}
	}
	
	public void createAccounts() {
		userDao.save(new User("Manager1", "admin", "Mr", "Bossman", "like@boss.com", roleDao.getReferenceById(2)));
		userDao.save(new User("Employee1", "pass", "No1", "Worker", "123@abc.com", roleDao.getReferenceById(1)));
		userDao.save(new User("Employee2", "pass", "No2", "Worker", "abc@123.net", roleDao.getReferenceById(1)));
		userDao.save(new User("Employee3", "pass", "No3", "Worker", "xyz@bbb.com", roleDao.getReferenceById(1)));
	}

}
