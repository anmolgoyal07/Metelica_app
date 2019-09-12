package com.sapient.marketdataservice.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.sapient.marketdataservice.bean.MetalPrice;

@Service
public class MarketdataService {

	Map<String, Double> priceByMetalName = new ConcurrentHashMap<>();

	public MetalPrice fetchMaketPriceOfmetal(String metalName) {
		Double price = priceByMetalName.get(metalName);
		MetalPrice metalPrice = new MetalPrice();
		metalPrice.setPrice(price == null ? 0.0 : price);
		metalPrice.setMetalName(metalName);
		return metalPrice;
	}

	public void addOrUpdateMetalPrice(MetalPrice metalPrice) {

		priceByMetalName.put(metalPrice.getMetalName(), metalPrice.getPrice());

	}

}
