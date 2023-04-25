package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entities.MyStudent;
import com.rest.service.MyService;

@RestController
public class MyController {

	@Autowired
	private MyService service;

	@PostMapping("/add")
	public ResponseEntity<MyStudent> addStudent(@RequestParam("rollno") int rollno,@RequestParam("student_name") String student_name,
			@RequestParam("clg_name") String clg_name, @RequestParam("branch_name") String branch_name) {
		try {
			MyStudent s = new MyStudent(rollno,student_name, clg_name, branch_name);
			service.addStudent(s);
			return new ResponseEntity<>(s, HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<MyStudent>(HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

}
