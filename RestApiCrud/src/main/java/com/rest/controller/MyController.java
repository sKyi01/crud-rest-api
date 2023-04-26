package com.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.customexception.StudentNotFoundException;
import com.rest.entities.MyStudent;
import com.rest.service.MyService;

@RestController
public class MyController {

	@Autowired
	private MyService service;

	@PostMapping("/add")
	public ResponseEntity<MyStudent> addStudent(@RequestBody MyStudent student) {
		try {
			MyStudent s = new MyStudent(student.getRollNo(), student.getName(), student.getClgName(),
					student.getBranch());
			service.addStudent(s);
			return new ResponseEntity<>(s, HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<MyStudent>(HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Object> getStudentById(@PathVariable("id") int id) {
		try {
			MyStudent student = service.getStudent(id);
			return new ResponseEntity<>(student, HttpStatus.OK);
		} catch (StudentNotFoundException e) {
			String errorMessage = "Student not found with ID: " + id;
			return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping("/getAll")
	public ResponseEntity<List<MyStudent>> geAll() {
		List<MyStudent> s = service.getAll();

		return new ResponseEntity<>(s, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<MyStudent> updateStudent(@PathVariable("id") int id, @RequestBody MyStudent updatedStd) {

		MyStudent std = service.updateStudentById(id, updatedStd);

		return new ResponseEntity<>(std, HttpStatus.CREATED);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<MyStudent> deleteStudentById(@PathVariable("id") int id) {
		service.deleteById(id);
		List<MyStudent> std = service.getAll();
		String msg = "deleted successfully";
		return new ResponseEntity(std, HttpStatus.OK);
	}

}
