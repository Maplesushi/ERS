package com.Expenses.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Expenses.demo.model.Request;

@Repository
public interface RequestDao extends JpaRepository<Request, Integer> {

}
