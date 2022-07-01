package com.Expenses.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.Expenses.demo.service.RequestService;
import com.Expenses.demo.service.RequestStatusService;
import com.Expenses.demo.service.RequestTypeService;
import com.Expenses.demo.service.UserRoleService;
import com.Expenses.demo.service.UserService;

@Component
public class PostLaunchDummyDataGenerator {

	private UserRoleService roleService;
	private RequestStatusService statusService;
	private RequestTypeService typeService;
	private UserService userService;
	private RequestService requestService;

	@Autowired
	public PostLaunchDummyDataGenerator(UserRoleService roleService, RequestStatusService statusService, 
			RequestTypeService typeService, UserService userService, RequestService requestService) 
	{
		this.roleService = roleService;
		this.statusService = statusService;
		this.typeService = typeService;
		this.userService = userService;
		this.requestService = requestService;
	}

	
	@EventListener(ApplicationReadyEvent.class) public void runAfterStartup() {
		roleService.addRoles(); 
		statusService.addStatus();
		typeService.addTypes();
		userService.createAccounts();
		requestService.createRequests();
		
	}
}
