package com.example.stsproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping("/welcome")
	public String welcome() {
		logger.info("ELK logger implemented !!!!!");
		return "Welcome ELK";
	}

}
