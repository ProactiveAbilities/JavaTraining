package com.northwind.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.northwind.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	
}
