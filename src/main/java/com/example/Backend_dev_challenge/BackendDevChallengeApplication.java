package com.example.Backend_dev_challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BackendDevChallengeApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BackendDevChallengeApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BackendDevChallengeApplication.class);
	}
}
