package com.pe.exchange.service;

import com.pe.exchange.entity.Exchange;

public interface ExchangeService {
	public Exchange getFromToExchange(String from, String to);
}
