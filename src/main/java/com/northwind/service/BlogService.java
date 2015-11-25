package com.northwind.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northwind.entity.Blog;
import com.northwind.entity.User;
import com.northwind.repository.BlogRepository;
import com.northwind.repository.UserRepository;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private UserRepository userRepository;

	public void save(Blog blog, String name) {
		User user = userRepository.findByName(name);
		blog.setUser(user);
		blogRepository.save(blog);
	}

}
