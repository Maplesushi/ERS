package com.Expenses.demo.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Expenses.demo.model.User;
import com.Expenses.demo.service.UserService;

@RestController(value = "/user")
@RequestMapping
public class UserController {

	private static final SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping(value = "/login")
	public String login(HttpSession session, @RequestBody User user) {
		User userLoggingIn = userService.getAccount(user);
		if (userLoggingIn == null) {
			return "failed";
		}
		if ((User) session.getAttribute("loggedInAccount") == null) {
			session.setAttribute("loggedInAccount", userLoggingIn);
			System.out.println(timeFormat.format(new Timestamp(System.currentTimeMillis())) + "  [ ("
					+ userLoggingIn.getUser_role().getWorkerRole() + ") '" + userLoggingIn.getErsUsername()
					+ "' signed in. ]");
			return "success";
		}
		return "Already logged in";
	}

	@PostMapping(value = "/logout")
	public String logout(HttpServletRequest req) {

		try {
			User userLoggingOut = (User) req.getSession(false).getAttribute("loggedInAccount");
			req.getSession(false).invalidate();
			if (userLoggingOut != null) {
				System.out.println(timeFormat.format(new Timestamp(System.currentTimeMillis())) + "  [ ("
						+ userLoggingOut.getUser_role().getWorkerRole() + ") '" + userLoggingOut.getErsUsername()
						+ "' signed out. ]");
				return "Logged out";
			}
		} catch (NullPointerException n) {
			System.out.println(timeFormat.format(new Timestamp(System.currentTimeMillis())) + "  " + req.getRemoteAddr()
					+ "  [ Failed logout attempt: not logged in. ] ");
			return "Already logged out";
		}

		return null;
	}
}
/*
 * @GetMapping public ModelAndView homepage() { return new
 * ModelAndView("redirect:https://www.google.com/"); }
 */