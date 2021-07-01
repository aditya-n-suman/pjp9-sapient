package com.asde.springboot.service;

import java.util.List;

import com.asde.springboot.entities.VaccineData;

public interface IFileReadingService {
	
	/**
	 * Return the list of vaccine cetres as read from the csv file provided as the method parameter
	 * @return
	 */
	public VaccineData readVaccinCentreData();
	
	/**
	 * Return the list of vaccine cetres as read from the csv file provided as the method parameter
	 * @param filename
	 * @return
	 */
	public List<VaccineData> readAllVaccinCentreData();

	/**
	 * Get the total no of slots for a location as per the vaccinetype
	 * @param location
	 * @return
	 */
	public Integer getTotalSlotsForLocation(String location, String vaccineType);
}
