package com.shina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shina.dto.UserDTO;

@Repository
public interface UserJpaRepository extends JpaRepository<UserDTO, String>{
	
	UserDTO findByName(String name);
	UserDTO findById(Long id); 
	
		
}