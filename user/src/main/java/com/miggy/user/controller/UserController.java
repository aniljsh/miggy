package com.miggy.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miggy.user.dto.UserDTO;
import com.miggy.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/find-all-users")
	public ResponseEntity<List<UserDTO>> getUsers() {
		List<UserDTO> users = userService.getUsers();

		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@PostMapping("/add-user")
	public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {

		userService.addUser(userDTO);

		return new ResponseEntity<>(userDTO, HttpStatus.CREATED);

	}

	@GetMapping("/find-user/{id}")
	public ResponseEntity<UserDTO> getUser(@PathVariable int id) {

		UserDTO userDTO = userService.getUser(id);

		if (userDTO != null) {
			return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

	}

}
