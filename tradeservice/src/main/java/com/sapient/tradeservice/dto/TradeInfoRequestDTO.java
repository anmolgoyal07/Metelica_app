package com.sapient.tradeservice.dto;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Bind to View and Delete Request for trade
 *
 */
public class TradeInfoRequestDTO {
	@NotBlank
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TradeInfoRequestDTO [id=" + id + "]";
	}

}
