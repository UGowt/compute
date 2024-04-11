package com.compute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Compute {
	@GetMapping(value="/compute")
	public String compute() {
		return "COMPUTE AWS";
	}

}
