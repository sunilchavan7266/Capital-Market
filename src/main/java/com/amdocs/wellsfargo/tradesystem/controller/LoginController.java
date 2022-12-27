package com.amdocs.wellsfargo.tradesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.wellsfargo.tradesystem.model.User;
import com.amdocs.wellsfargo.tradesystem.service.UserService;

/**
 *
 * @author Jeevan
 */
@RestController
public class LoginController {

	@Autowired
	private UserService userService;

	/*
	 * This method is used to login the user to the insurance system.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<User> createUser(@RequestBody User user) throws Exception {
		String username = user.getUsername();
		String password = user.getUserpwd();
		user = userService.loginUser(username, password);
		return ResponseEntity.ok().body(user);

	}

}
