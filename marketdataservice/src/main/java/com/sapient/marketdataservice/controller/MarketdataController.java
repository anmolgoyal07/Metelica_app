package com.sapient.marketdataservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.marketdataservice.bean.MetalPrice;
import com.sapient.marketdataservice.service.MarketdataService;

@RestController
public class MarketdataController {

	@Autowired
	private MarketdataService marketdataService;

	@GetMapping("/marketdata/{metalName}")
	public MetalPrice fetchMaketPriceOfmetal(@PathVariable String metalName){
		return marketdataService.fetchMaketPriceOfmetal(metalName);
	}
	
	@PostMapping("/marketdata")
	public HttpStatus addOrUpdateMetalPrice(@RequestBody MetalPrice metalPrice){
		marketdataService.addOrUpdateMetalPrice(metalPrice);
		return HttpStatus.CREATED;
	}
	
}
