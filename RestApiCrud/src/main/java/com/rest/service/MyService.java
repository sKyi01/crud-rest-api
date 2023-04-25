package com.rest.service;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.rest.entities.MyStudent;
import com.rest.repository.MyRepository;
import com.rest.customexception.StudentNotFoundException;

@Service
public class MyService {
	@Autowired
	private MyRepository repo;
	
	public void addStudent(MyStudent s) {
		if(s.getName()==null || s.getBranch()==null || s.getClgName()==null || s.getRollNo()==null) {
			throw new IllegalArgumentException();
		}
		repo.save(s);
		
	}
	

	public MyStudent getStudent(int id) {
		Optional<MyStudent> s=repo.findById(id);
		if (s.isPresent()) {
	        return s.get();
	    } else {
	        throw new StudentNotFoundException("Student not found with ID: " + id);
	    }
		
	}
	
	public List<MyStudent> getAll(){
		Iterable<MyStudent> i=repo.findAll();
		List<MyStudent> std=new ArrayList<>();
		i.forEach(std::add);
		return std;
		
	}
	
	
	
	
	

}
