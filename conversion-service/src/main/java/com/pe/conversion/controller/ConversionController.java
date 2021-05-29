package com.pe.conversion.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pe.conversion.service.ConversionService;

@RestController
public class ConversionController {
	private Logger log = LoggerFactory.getLogger(ConversionController.class);

	@Autowired
	private ConversionService conversionService;

	@GetMapping("/conversion/from/{from}/to/{to}/quantity/{quantity}")
	public Double conversion(@PathVariable("from") String from,
							@PathVariable("to") String to,
							@PathVariable("quantity") Double quantity) {
		Double quantityResponse = conversionService.conversion(from, to, quantity);
		System.out.println("quantityResponse -> " + quantityResponse);
		return quantityResponse;
	}

}
