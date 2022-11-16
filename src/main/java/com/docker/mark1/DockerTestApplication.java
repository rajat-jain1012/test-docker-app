package com.docker.mark1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerTestApplication {

	@GetMapping("/")
	public String testRoute() {
		return "Hey Rajat";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}

}
