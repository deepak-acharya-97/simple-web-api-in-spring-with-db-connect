package com.javapoint.loaddatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.*;

import com.javapoint.models.Employee;
import com.javapoint.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		return args -> {
			log.info("Preloading "+ repository.save(new Employee("Pranay Shetty", "Software Developer - Level 1")));
			log.info("Preloading "+ repository.save(new Employee("Ramnath Kovind", "Tester")));
		};
	}
}
