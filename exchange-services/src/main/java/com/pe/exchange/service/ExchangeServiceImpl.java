package com.pe.exchange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.exchange.entity.Exchange;
import com.pe.exchange.repository.ExchangeRepository;


@Service
public class ExchangeServiceImpl implements ExchangeService {

	@Autowired
	private ExchangeRepository exchangeRepository;
	
	@Override
	public Exchange getFromToExchange(String from, String to) {
		return exchangeRepository.findByFromAndTo(from, to);
	}

}
