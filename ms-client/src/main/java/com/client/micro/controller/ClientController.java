package com.client.micro.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {
	@Value("${configname}")
	private String configName;

	@GetMapping("/getConfigName")
	String getCity() {
		return "AppConfig: " + configName;
	}
}
