package org.blogsh.personalBlog.controller;

import java.util.Optional;

import org.blogsh.personalBlog.Service.UsersService;
import org.blogsh.personalBlog.model.UserLogin;
import org.blogsh.personalBlog.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsersController {
	@Autowired
	private UsersService usersService;
	
	@PostMapping("/login")
	public ResponseEntity<UserLogin> Autentication(@RequestBody Optional<UserLogin> user){
		return usersService.signIn(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/signup")
	public ResponseEntity<Users> Post(@RequestBody Users users) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(usersService.signUp(users));
	}
	
}
