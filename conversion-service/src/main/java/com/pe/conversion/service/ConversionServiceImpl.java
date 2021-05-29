package com.pe.conversion.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pe.conversion.api.ExchangeServiceApi;

@Service
public class ConversionServiceImpl implements ConversionService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	Map<String, String> variables = new HashMap<String, String>();
	
	@Autowired
	private ExchangeServiceApi exchangeServiceApi;

	@Override
	public Double conversion(String from, String to, Double quantity) {
		Double response = null;
		variables.put("from", from);
		variables.put("to", to);

//		ResponseEntity<Double> exchange = new RestTemplate()
//				.getForEntity("http://localhost:5050/exchange/from/{from}/to/{to}", Double.class, variables);
//		System.out.println("service status : " + exchange.getStatusCode());
//		if (exchange.getStatusCode() == HttpStatus.OK) {
//			response = exchange.getBody();
//		}
//		System.out.println("service response : " + response);
		Double exchange = exchangeServiceApi.getExchange(from, to);
		response = exchange.doubleValue()*quantity;
		return response;
	}

}
