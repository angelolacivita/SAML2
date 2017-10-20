package com.samlgroup.samlartifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = HomeController.class)
public class SamlartifactApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamlartifactApplication.class, args);
	}
}
