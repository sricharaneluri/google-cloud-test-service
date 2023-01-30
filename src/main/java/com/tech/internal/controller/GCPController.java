package com.tech.internal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GCPController {
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "Hello from Google Cloud";
	}

}
