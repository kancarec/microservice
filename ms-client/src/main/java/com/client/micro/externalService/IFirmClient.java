package com.client.micro.externalService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("FIRM")
@RequestMapping("/api/v1/firm")
public interface IFirmClient {
	@GetMapping("/getFirmCity")
	public String getFirmCity();
}
