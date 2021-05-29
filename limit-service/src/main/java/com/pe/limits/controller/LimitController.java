package com.pe.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.limits.config.Configuration;
import com.pe.limits.dto.LimitResponse;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/values")
	public LimitResponse getLimit() {
		return new LimitResponse(configuration.getMaximun(), configuration.getMinimun());
	}

}
