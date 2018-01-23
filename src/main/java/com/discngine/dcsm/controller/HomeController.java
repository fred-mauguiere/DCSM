package com.discngine.dcsm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome to Discngine Cloud Subscription Manager");
		model.addAttribute("tagline", "");
		return "main";
	}
}
