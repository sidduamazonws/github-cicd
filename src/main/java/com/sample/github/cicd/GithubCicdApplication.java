package com.sample.github.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdApplication {

	@GetMapping("/greet")
	public String welcome() {
		return "Welcome to github CI/CD ... ";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdApplication.class, args);
	}

}
