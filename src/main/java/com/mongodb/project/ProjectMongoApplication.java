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

/*	@Bean
	CommandLineRunner initDatabase(UserRepository repository) {
		return args -> {
			repository.deleteAll(); // limpa dados antigos

			User maria = new User(null, "Maria Silva", "maria@gmail.com");
			User alex = new User(null, "Alex Souza", "alex@gmail.com");

			repository.saveAll(Arrays.asList(maria, alex));
			System.out.println("Usuários inseridos no MongoDB!");
		};
	}*/


}
