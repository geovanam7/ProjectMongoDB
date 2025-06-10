package com.mongodb.project;

import com.mongodb.project.domain.User;
import com.mongodb.project.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class ProjectMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMongoApplication.class, args);
	}


}
