package com.asde.springboot.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpringbootControllerTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	@DisplayName("/home page api test")
	void testMessage() {

		URI targetUrl = UriComponentsBuilder.fromUriString("/").build().encode().toUri();

		String message = this.restTemplate.getForObject(targetUrl, String.class);
		assertEquals("This is an app that helps you find vaccine centres", message);
	}

	@Test
	@DisplayName("/vaccine centre data")
	void testVaccineCentreData() {

		URI targetUrl = UriComponentsBuilder.fromUriString("/getVaccineCentres").build().encode().toUri();

		Object vaccineCentres = this.restTemplate.getForObject(targetUrl, Object.class);
		assertTrue(vaccineCentres instanceof List<?>);
	}

	@Test
	@DisplayName("/vaccine slots ")
	void testVaccineCentreSlots() {

		URI targetUrl = UriComponentsBuilder.fromUriString("/getSlotsForLocation?location=gurugram&vaccineType=covaxin")
				.build().encode().toUri();

		Object vaccineCentres = this.restTemplate.getForObject(targetUrl, Object.class);
		assertTrue(vaccineCentres instanceof Integer);
	}
}
