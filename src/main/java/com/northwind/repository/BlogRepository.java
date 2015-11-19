package com.northwind.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.northwind.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

	
}
