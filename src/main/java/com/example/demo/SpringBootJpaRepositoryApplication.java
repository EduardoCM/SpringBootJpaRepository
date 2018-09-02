package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.jpa.repository.PersonJpaRepository;

@SpringBootApplication
public class SpringBootJpaRepositoryApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaRepositoryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 101 -> {} ", repository.findById(101));
		
	}
}
