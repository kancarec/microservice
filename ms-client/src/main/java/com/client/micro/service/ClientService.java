package com.client.micro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.micro.externalService.IFirmClient;

@Service
public class ClientService {
	@Autowired
	private IFirmClient firmService;

	public String getCityName() {
		return this.firmService.getFirmCity();
	}
}
