package com.pe.exchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.pe.exchange.service.ExchangeServiceImpl;
 
@RestController
public class ExchangeController { 
	
	@Autowired
	private ExchangeServiceImpl exchangeService;
	
	@GetMapping("exchange/from/{from}/to/{to}")
	public Double getExchange(@PathVariable("from") String from, @PathVariable("to") String to) {
		
		
		return exchangeService.getFromToExchange(from, to).getValue();
	}

}
