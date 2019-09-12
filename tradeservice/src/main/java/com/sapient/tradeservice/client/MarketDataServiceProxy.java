package com.sapient.tradeservice.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sapient.tradeservice.bean.MetalPrice;

//@FeignClient(name="trade-service", url="localhost:9002")
//@FeignClient(name="market-data-service")
@FeignClient(name="zuul-api-gateway-server")
@RibbonClient(name="market-data-service")
public interface MarketDataServiceProxy {

	@GetMapping(value="/market-data-service/marketdata/{metalName}")
	public MetalPrice fetchMaketPriceOfmetal(@PathVariable("metalName") String metalName);
}
