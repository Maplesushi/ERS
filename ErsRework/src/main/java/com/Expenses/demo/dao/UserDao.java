package com.Expenses.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Expenses.demo.model.User;
import com.Expenses.demo.model.UserRole;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	User findByErsUsername(String username);

	void save(UserRole userRole);

}
