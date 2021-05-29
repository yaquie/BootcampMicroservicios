package com.pe.exchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ExchangeServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangeServicesApplication.class, args);
	}

}
