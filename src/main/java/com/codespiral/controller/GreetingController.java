package com.codespiral.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping("/greeting")
	public String getHelloMessage(@RequestParam(value="name",required=false) String name) {
		if(name == null || String.valueOf(name).isEmpty())
			name = ", World";
		else
			name = ", ".concat(name.trim());
		return "Hello".concat(name);
	} 

}
