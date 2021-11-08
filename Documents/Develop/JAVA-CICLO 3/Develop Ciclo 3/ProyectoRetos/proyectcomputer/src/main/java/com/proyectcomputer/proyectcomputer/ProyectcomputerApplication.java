package com.proyectcomputer.proyectcomputer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages={"com.proyectcomputer.proyectcomputer.model"})
public class ProyectcomputerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectcomputerApplication.class, args);

	}

}
