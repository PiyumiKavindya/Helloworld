package com.example.loits.Helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello-world")
public class HellowordApplication {



	@GetMapping("/welcome")

	public String welcome() {
		return "Welcome to LOIT";
	}

	public static void main(String[] args) {
		SpringApplication.run(HellowordApplication.class, args);
	}

}
