package com.pe.conversion.api;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "api-gateway")  //@FeignClient(name = "exchange-service")
@RibbonClient(name = "exchange-service")
public interface ExchangeServiceApi {

	@GetMapping("/exchange-service/exchange/from/{from}/to/{to}") ///exchange/from/{from}/to/{to}
	public Double getExchange(@PathVariable("from") String from, @PathVariable("to") String to);
}
