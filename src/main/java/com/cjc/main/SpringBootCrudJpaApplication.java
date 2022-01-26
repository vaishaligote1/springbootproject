package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class SpringBootCrudJpaApplication {

	public static void main(String[] args) {
		System.out.println("main method");
		SpringApplication.run(SpringBootCrudJpaApplication.class, args);
	}

}
