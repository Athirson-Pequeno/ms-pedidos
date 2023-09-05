package com.tizo.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tizo.user.entities.User;

public interface UserRepositoy extends JpaRepository<User, Long>  {

	User findByEmail(String email);
	
}
