package com.gerrit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class GerritStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerritStudyApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure( SpringApplicationBuilder application ) {
		return application.sources(GerritStudyApplication.class);
	}
}
