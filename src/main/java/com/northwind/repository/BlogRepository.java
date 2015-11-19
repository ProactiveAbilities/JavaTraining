package com.northwind.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.northwind.entity.Blog;
import com.northwind.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

	List<Blog> findByUser(User user);
}
