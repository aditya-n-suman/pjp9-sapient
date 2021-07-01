package com.asde.springboot.entities;

import org.springframework.stereotype.Repository;

@Repository
public class VaccineData {
	
	String vaccineType;
	String location;
	Boolean available;
	Integer slots;
	
	public Integer getSlots() {
		return slots;
	}
	public void setSlots(Integer slots) {
		this.slots = slots;
	}
	public String getVaccineType() {
		return vaccineType;
	}
	public void setVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "VaccineData [vaccineType=" + vaccineType + ", location=" + location + ", available=" + available + "]";
	}

}
