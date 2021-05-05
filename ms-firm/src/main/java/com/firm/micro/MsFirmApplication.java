package com.firm.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsFirmApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFirmApplication.class, args);
	}

}
