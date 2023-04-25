package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.rest.entities.MyStudent;
import com.rest.repository.MyRepository;

@Service
public class MyService {
	@Autowired
	private MyRepository repo;
	
	public void addStudent(MyStudent s) {
		if(s.getName()==null || s.getBranch()==null || s.getClgName()==null) {
			throw new IllegalArgumentException();
		}
		repo.save(s);
		
	}
	
	public 
	
	
	

}
