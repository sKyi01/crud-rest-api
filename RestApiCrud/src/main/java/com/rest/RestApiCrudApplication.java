package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import com.rest.entities.MyStudent;
import com.rest.repository.MyRepository;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiCrudApplication.class, args);

	}

}
