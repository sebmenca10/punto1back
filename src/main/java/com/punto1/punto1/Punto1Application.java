package com.punto1.punto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Punto1Application {

	public static void main(String[] args) {
		System.setProperty("server.port", "8081");
		SpringApplication.run(Punto1Application.class, args);
	}

}
