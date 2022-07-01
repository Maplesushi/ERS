package com.Expenses.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Expenses.demo.model.ReimbursementStatus;

public interface RequestStatusDao extends JpaRepository<ReimbursementStatus, Integer> {

}
