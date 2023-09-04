package com.tizo.user.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tizo.user.entities.User;

public interface UserRepositoy extends JpaRepository<User, Long>  {

	User findByEmail(String email);
	
	List<User> findByRole(String role);
	
}
