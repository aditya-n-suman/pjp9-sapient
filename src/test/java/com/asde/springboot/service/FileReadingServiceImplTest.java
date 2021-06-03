package com.asde.springboot.service;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.asde.springboot.entities.VaccineData;

public class FileReadingServiceImplTest {

	@Test
	void testReadVaccineCentreData() {
		IFileReadingService fileReadingServie = new FileReadingServiceImpl();
		assertTrue(fileReadingServie.readVaccinCentreData("testVaccineCentreData.txt") instanceof VaccineData);
	}

	@Test
	void testGetTotalSlotsForLocation() {
		IFileReadingService fileReadingServie = new FileReadingServiceImpl();
		assertTrue(fileReadingServie.getTotalSlotsForLocation("gurugram", "covaxin") instanceof Integer);
	}

	@Test
	void testGetTotalSlotsForLocation1() {
		IFileReadingService fileReadingServie = new FileReadingServiceImpl();
		assertTrue(fileReadingServie.getTotalSlotsForLocation("gurugram", "covaxin") == 50);
	}

}
