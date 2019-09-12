package com.sapient.marketdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MarketdataserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketdataserviceApplication.class, args);
	}

}
