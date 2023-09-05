package com.tizo.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tizo.user.entities.Role;
import com.tizo.user.entities.User;
import com.tizo.user.repositories.RoleRepository;
import com.tizo.user.repositories.UserRepositoy;

@Service
public class UserRoleService {
	
	@Autowired
	private UserRepositoy userRepositoy;
	
	@Autowired
	private RoleRepository roleRepository;
	
	public void AddUserRole(Long userId, Long roleID) {
		
		User user = userRepositoy.findById(userId).get();
		Role role = roleRepository.findById(roleID).get();
		
		user.getRoles().add(role);
		
		userRepositoy.save(user);
	}

}

