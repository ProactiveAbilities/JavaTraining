package com.northwind.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.northwind.repository.UserRepository;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String>{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void initialize(UniqueUsername constraintAnnotation) {
	}

	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
		//return false;
		if (userRepository == null) //debido a InitDbService - init.
		{
			return true;
		}
		return userRepository.findByName(username) == null;
	}

}
