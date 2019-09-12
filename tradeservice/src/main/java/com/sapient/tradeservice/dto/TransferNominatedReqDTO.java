package com.sapient.tradeservice.dto;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Bind to transfer nominated request event JSON.
 *
 */
public class TransferNominatedReqDTO {
	@NotEmpty
	private List<String> tradeIds;

	public List<String> getTradeIds() {
		return tradeIds;
	}

	public void setTradeIds(List<String> tradeIds) {
		this.tradeIds = tradeIds;
	}

	@Override
	public String toString() {
		return "TradeNominateReqDTO [tradeIds=" + tradeIds + "]";
	}

}
