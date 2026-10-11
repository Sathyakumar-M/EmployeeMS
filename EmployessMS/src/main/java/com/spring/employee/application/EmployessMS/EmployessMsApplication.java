package com.spring.employee.application.EmployessMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployessMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployessMsApplication.class, args);
	}

}
