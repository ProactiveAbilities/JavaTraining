package com.northwind.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.northwind.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	
}
