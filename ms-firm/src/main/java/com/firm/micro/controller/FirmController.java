package com.firm.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/firm")
public class FirmController {
	@GetMapping("/getFirmCity")
	String getFirmCity() {
		return "Nice";
	}
	@PostMapping("/addClient")
	String addClient() {
		return "Nice";
	}

}
