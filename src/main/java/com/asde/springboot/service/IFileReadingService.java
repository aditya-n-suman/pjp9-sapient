package com.asde.springboot.service;

import com.asde.springboot.entities.VaccineData;

public interface IFileReadingService {
	
	public VaccineData readVaccinCentreData(String filename);

	
	/**
	 * Get the total no of slots for a location as per the vaccinetype
	 * @param location
	 * @return
	 */
	public Integer getTotalSlotsForLocation(String location, String vaccineType);
}
