package com.northwind.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.northwind.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);

	
}
