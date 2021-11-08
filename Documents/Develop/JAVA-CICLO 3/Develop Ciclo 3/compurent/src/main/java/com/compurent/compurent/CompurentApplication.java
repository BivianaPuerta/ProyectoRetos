package com.compurent.compurent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages ={"com.compurent.compurent.model"})
@SpringBootApplication
public class CompurentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompurentApplication.class, args);
	}

}
