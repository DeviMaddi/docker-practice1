package com.example.pratice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerPracticeApplication {
	@GetMapping("/testing")
	public String getMesgage() {
		return "hello there";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerPracticeApplication.class, args);
	}

}
