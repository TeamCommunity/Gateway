package com.tech.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {

	@GetMapping("/")
	public String sentence() {
		return "team";
	}
}