package com.pe.limits.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties("limits-service")
@Getter
@Setter
public class Configuration {
	private int maximun;
	private int minimun;
}
