package com.udemy.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.demo.configuration.CurrencyServiceConfiguration;

@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration configuration;

	@GetMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieve(){
		return configuration;
	}
}
