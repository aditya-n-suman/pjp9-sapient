package com.asde.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asde.springboot.entities.VaccineData;
import com.asde.springboot.service.IFileReadingService;

@RestController
public class VaccineCentreController {

	@Autowired
	IFileReadingService fileReadingService;

	@RequestMapping("/")
	public String sayHello() {
		return "This is an app that helps you find vaccine centres";
	}

	/**
	 * Fetch the relevant vaccine centre data
	 */
	@RequestMapping("/getVaccineCentres")
	public List<VaccineData> getVaccineCentreData() {
		return null;
	}

	/**
	 * Fetch the relevant vaccine centre data
	 */
	@RequestMapping("/getSlotsForLocation")
	public Integer getSlotsForLocation(@RequestParam(required = true) String location,
			@RequestParam(required = true) String vaccineType) {
		return null;
	}

}
