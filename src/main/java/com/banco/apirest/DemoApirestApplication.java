package com.banco.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class DemoApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApirestApplication.class, args);
	}
	
	
}
