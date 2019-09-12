package com.sapient.tradeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.shared.Application;
import com.sapient.tradeservice.bean.Trade;
import com.sapient.tradeservice.service.TradeService;

@RestController
public class TradeController {

	@Autowired
	private TradeService tradeService;
	
	@PostMapping
	public void buyOrSellMetal(@RequestBody Trade trade){
		tradeService.addTrade(trade);
	}
	
	 @Autowired
	    private DiscoveryClient discoveryClient;
	
	@GetMapping("/{metalName}") 
	public List<Trade> fetchTrades(@PathVariable String metalName) {
		//discoveryClient.g
		for(String service : discoveryClient.getServices()) {
			for(ServiceInstance serviceInstance:discoveryClient.getInstances(service)) {
				 String name = serviceInstance.getUri().toString();
		            System.out.println(name + ": ");
			}
		}
		return tradeService.fetchTrades(metalName);
	}
}
