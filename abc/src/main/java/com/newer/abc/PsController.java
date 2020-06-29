package com.newer.abc;

import org.springframework.web.bind.annotation.GetMapping;

public class PsController {
	
	@GetMapping("/hello")
	public String hello() {
		return "home";
	}
	

}
