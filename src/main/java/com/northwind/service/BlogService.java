package com.northwind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.northwind.entity.Blog;
import com.northwind.entity.Item;
import com.northwind.entity.User;
import com.northwind.exception.RssException;
import com.northwind.repository.BlogRepository;
import com.northwind.repository.ItemRepository;
import com.northwind.repository.UserRepository;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private RssService rssService;
	
	@Autowired
	private ItemRepository itemRepository;
	
	public void saveItems(Blog blog)
	{
		try {
			List<Item> items = rssService.getItems(blog.getUrl());
			for (Item item : items) {
				Item savedItem = itemRepository.findByBlogAndLink(blog, item.getLink());
				if(savedItem == null)
				{
					item.setBlog(blog);
					itemRepository.save(item);
				}
			}
		} catch (RssException e) {
			e.printStackTrace();
		}
	}
	
	//1 hour = 60 seg * 60 min * 1000 
	@Scheduled(fixedDelay=3600000)
	public void reloadBlogs()
	{
		List<Blog> blogs = blogRepository.findAll();
		for (Blog blog : blogs) {
			saveItems(blog);
		}
	}
	
	@Autowired
	private UserRepository userRepository;
	
	public void save(Blog blog, String name)
	{
		User user = userRepository.findByName(name);
		blog.setUser(user);
		blogRepository.save(blog);
		saveItems(blog);		
	}

//	public void delete(int id) {
//		blogRepository.delete(id);
//		
//	}
    @PreAuthorize("#blog.user.name == authentication.name or hasRole('ROLE_ADMIN')")
	public void delete(@P("blog") Blog blog) {
		blogRepository.delete(blog);
		
	}

	public Blog findOne(int id) {
		return blogRepository.findOne(id);		
	}
}
