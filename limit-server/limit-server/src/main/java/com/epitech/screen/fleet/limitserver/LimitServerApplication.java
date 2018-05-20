package com.epitech.screen.fleet.limitserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class LimitServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitServerApplication.class, args);
	}
}
