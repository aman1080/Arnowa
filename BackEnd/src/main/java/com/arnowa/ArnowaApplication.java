package com.arnowa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication

public class ArnowaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArnowaApplication.class, args);
	}

}
