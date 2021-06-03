package com.asde.springboot.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;
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

		Object vaccineCentres = this.restTemplate.getForObject(targetUrl, String.class);
		assertTrue(vaccineCentres instanceof List<?>);
	}
}
