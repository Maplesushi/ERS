package com.Expenses.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Expenses.demo.model.Request;
import com.Expenses.demo.model.User;
import com.Expenses.demo.service.RequestService;


@Controller(value = "/request")
@RequestMapping
public class RequestController {
	
	private RequestService requestservice;
	
	@Autowired
	public RequestController(RequestService requestservice) {
		this.requestservice = requestservice;
	}

	@PutMapping(value = "/submit")
	public @ResponseBody String submitRequest(@RequestBody Request request, HttpServletRequest req) {
		User loggedInUser = (User) req.getSession().getAttribute("loggedInAccount");
		
		return null;
	}
	@PostMapping(value = "/deny")
	public @ResponseBody String denyRequest(@RequestBody Request request, HttpServletRequest req) {
		User loggedInUser = (User) req.getSession().getAttribute("loggedInAccount");
		if(loggedInUser.getUser_role().getRoleId() != 2) {
			return null;
		}
		else {
			requestservice.editRequest(request);
		}
		return null;
	}
	@PostMapping(value = "/approve")
	public @ResponseBody String approveRequest(@RequestBody Request request, HttpServletRequest req) {
		User loggedInUser = (User) req.getSession().getAttribute("loggedInAccount");
		if(loggedInUser.getUser_role().getRoleId() != 2) {
			return null;
		}
		else {
			requestservice.editRequest(request);
		}
		return null;
	}
	@PostMapping(value = "/retrieve-all")
	public @ResponseBody String retrieveRequests(@RequestBody User user) {
		
		return null;
	}
	@PostMapping(value = "/retrieve")
	public @ResponseBody String retrieveRequest(@RequestBody User user) {
		
		return null;
	}
	@PostMapping(value = "/filter")
	public @ResponseBody String filterRequests(@RequestBody User user) {
		
		return null;
	}
}
