package com.sapient.tradeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.sapient.tradeservice")
public class TradeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeserviceApplication.class, args);
	}

}
