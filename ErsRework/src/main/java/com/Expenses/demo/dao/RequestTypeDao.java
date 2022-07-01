package com.Expenses.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Expenses.demo.model.ReimbursementType;

public interface RequestTypeDao extends JpaRepository<ReimbursementType, Integer> {

}
