package com.pipal.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PipalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PipalApplication.class, args);
	}

}
