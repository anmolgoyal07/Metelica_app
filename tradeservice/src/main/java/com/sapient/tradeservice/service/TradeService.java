package com.sapient.tradeservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.sapient.tradeservice.bean.MetalPrice;
import com.sapient.tradeservice.bean.Trade;
import com.sapient.tradeservice.client.MarketDataServiceProxy;

@Service
public class TradeService {

	@Autowired
	private MarketDataServiceProxy marketDataServicePorxy;
	
	private Map<String,List<Trade>> tradesByMetal = new ConcurrentHashMap<>();
	
	public void addTrade(Trade trade) {
		
		MetalPrice metalPrice = marketDataServicePorxy.fetchMaketPriceOfmetal(trade.getMetalName());
		List<Trade> trades = tradesByMetal.getOrDefault(trade.getMetalName(), new ArrayList<>());
		
		
		
		trade.setPrice(metalPrice.getPrice());
		
		trades.add(trade);
		
		tradesByMetal.put(trade.getMetalName(), trades);
	}
	
	public List<Trade> fetchTrades(@PathVariable String metalName) {
		return tradesByMetal.get(metalName);
	}
	
	
	
}
