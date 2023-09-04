package com.tizo.user.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tizo.user.entities.User;
import com.tizo.user.repositories.UserRepositoy;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@Autowired
	private UserRepositoy userRepositoy;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = userRepositoy.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){
		User obj = userRepositoy.findByEmail(email);
		return ResponseEntity.ok(obj);
		
	}
	
	@GetMapping(value = "/roles")
	public ResponseEntity<List<User>> findByRole(@RequestParam String role){
		List<User> list = userRepositoy.findByRole(role);
		return ResponseEntity.ok(list);
		
	}
	
}
