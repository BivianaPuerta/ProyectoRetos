package com.example.proyecto.proyectoretos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@EntityScan(basePackages = {"com.example.proyecto.proyectoretos.model"})
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ProyectoretosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoretosApplication.class, args);
	}

}
