package com.Expenses.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expenses.demo.dao.RequestStatusDao;
import com.Expenses.demo.model.ReimbursementStatus;

@Service
public class RequestStatusService {
	
	private RequestStatusDao dao;
	
	@Autowired
	public RequestStatusService(RequestStatusDao dao) {
		this.dao = dao;
	}

	public void addStatus() {
		dao.save(new ReimbursementStatus(0, "Pending"));
		dao.save(new ReimbursementStatus(0, "Approved"));
		dao.save(new ReimbursementStatus(0, "Denied"));
	}
}
