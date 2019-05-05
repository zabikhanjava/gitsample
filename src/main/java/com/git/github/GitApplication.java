package com.git.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitApplication.class, args);
		System.out.println("hi feature2");
		System.out.println("hi feature1");
	}