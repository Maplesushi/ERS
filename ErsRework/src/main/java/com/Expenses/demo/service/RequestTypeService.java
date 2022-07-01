package com.Expenses.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expenses.demo.dao.RequestTypeDao;
import com.Expenses.demo.model.ReimbursementType;

@Service
public class RequestTypeService {

	private RequestTypeDao dao;
	
	@Autowired
	public RequestTypeService(RequestTypeDao dao) {
		this.dao = dao;
	}
	
	public void addTypes() {
		dao.save(new ReimbursementType(0, "Lodging"));
		dao.save(new ReimbursementType(0, "Travel"));
		dao.save(new ReimbursementType(0, "Food"));
		dao.save(new ReimbursementType(0, "Other"));
	}
	

}
