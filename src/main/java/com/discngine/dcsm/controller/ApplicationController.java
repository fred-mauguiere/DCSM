package com.discngine.dcsm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.discngine.dcsm.service.ApplicationService;

@Controller
public class ApplicationController {
	
	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping("/applications")
	public String listapps(Model model) {
		model.addAttribute("application",applicationService.getAllApplications());
		return "applications";
	}
}
