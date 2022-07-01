package com.Expenses.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Expenses.demo.model.UserRole;

@Repository
public interface UserRoleDao extends JpaRepository<UserRole, Integer> {

}
