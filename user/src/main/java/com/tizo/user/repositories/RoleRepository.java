package com.tizo.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tizo.user.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
