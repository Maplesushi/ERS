package com.Expenses.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expenses.demo.dao.RequestDao;
import com.Expenses.demo.model.Request;

@Service
public class RequestService {
	
	private RequestDao dao;

	@Autowired
	public RequestService(RequestDao dao) {
		this.dao = dao;
	}
	public void editRequest(Request request) {
		dao.save(request);
	}
	public void createRequests() {
		dao.save(new Request(0, 2, 100000000.01f, "today", "tomorrow", "nunya", 1, 1, 1));
		dao.save(new Request(0, 2, 100000000.01f, "today", "tomorrow", "nunya", 1, 1, 1));
		dao.save(new Request(0, 2, 100000000.01f, "today", "tomorrow", "nunya", 1, 1, 1));
		dao.save(new Request(0, 2, 100000000.01f, "today", "tomorrow", "nunya", 1, 1, 1));
	}

}

