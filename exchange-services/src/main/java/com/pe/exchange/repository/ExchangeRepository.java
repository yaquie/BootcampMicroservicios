package com.pe.exchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pe.exchange.entity.Exchange;

@Repository
public interface ExchangeRepository extends JpaRepository<Exchange, Integer> {
	Exchange findByFromAndTo(String from, String to);

}
