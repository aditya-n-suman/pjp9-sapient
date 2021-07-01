package com.asde.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asde.springboot.entities.VaccineData;
import com.asde.springboot.service.IFileReadingService;

@RestController
public class VaccineCentreController {

	@Autowired
	IFileReadingService fileReadingService;

	/**
	 * Home page of the application
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String sayHello() {
		return "This is an app that helps you find vaccine centres";
	}

	/**
	 * TODO: Fetch the relevant vaccine centre data, i.e. the data of all vaccine
	 * centeres available with vaccines Example: returns the total no of vaccine
	 * center rows that are available in the file
	 */
	@RequestMapping("/getVaccineCentres")
	public List<VaccineData> getVaccineCentreData() {
        return fileReadingService.readAllVaccinCentreData();
	}

	/**
	 * TODO: Fetch the relevant vaccine centre data based on the parameters passed
	 * by the user Example: return 50 for gurugram and covaxin
	 */
	@RequestMapping("/getSlotsForLocation")
	public Integer getSlotsForLocation(@RequestParam(required = true) String location,
			@RequestParam(required = true) String vaccineType) {
        
        // Integer availableVaccines = 0;
        return fileReadingService.getTotalSlotsForLocation(location, vaccineType);
	}

}








