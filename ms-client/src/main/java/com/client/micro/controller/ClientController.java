package com.client.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.micro.service.ClientService;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {
	@Value("${configname}")
	private String configName;
	@Autowired
	ClientService clientService;

	@GetMapping("/getCity")
	String getCity() {
		return clientService.getCityName();
	}
}
