package com.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.entities.MyStudent;

@Repository
public interface MyRepository extends CrudRepository<MyStudent,Integer>{
	
	

}
