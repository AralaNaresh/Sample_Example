package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Display {

	@GetMapping("/Hai")
	public String print() {
		return "Helloo";
	}
}
