package com.example.travisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsApplication.class, args);
	}

	
	@GetMapping("/hi")
	public String sayHi() {return "hi";}
	
}
