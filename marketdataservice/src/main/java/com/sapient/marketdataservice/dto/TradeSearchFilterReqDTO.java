package com.sapient.marketdataservice.dto;

import java.util.List;

/**
 * Bind to search filter request JSON
 *
 */
public class TradeSearchFilterReqDTO {
	private String fromDate;
	private String toDate;
	private String commodity;
	private List<String> sides;
	private String counterParty;
	private String location;
	private List<String> locationList;
	private Boolean transportArranged;

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getCommodity() {
		return commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public String getCounterParty() {
		return counterParty;
	}

	public void setCounterParty(String counterParty) {
		this.counterParty = counterParty;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<String> getLocationList() {
		return locationList;
	}

	public void setLocationList(List<String> locationList) {
		this.locationList = locationList;
	}

	public Boolean getTransportArranged() {
		return transportArranged;
	}

	public void setTransportArranged(Boolean transportArranged) {
		this.transportArranged = transportArranged;
	}

	public List<String> getSides() {
		return sides;
	}

	public void setSides(List<String> sides) {
		this.sides = sides;
	}

	@Override
	public String toString() {
		return "TradeSearchFilterReqDTO [fromDate=" + fromDate + ", toDate=" + toDate + ", commodity=" + commodity
				+ ", sides=" + sides + ", counterParty=" + counterParty + ", location=" + location + ", locationList="
				+ locationList + ", transportArranged=" + transportArranged + "]";
	}

}
