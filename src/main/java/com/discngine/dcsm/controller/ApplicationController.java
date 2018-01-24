package com.discngine.dcsm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.discngine.dcsm.domain.Application;

@Controller
public class ApplicationController {
	@RequestMapping("/applications")
	public String list(Model model) {
		Application threedescision = new Application();
		threedescision.setApplicationCode("3DESC");
		threedescision.setLabel("3 DESCISION");
		threedescision.setDescription("Discngine 3descision");
		threedescision.setApplicationUrl("http://3descision/");
		model.addAttribute("application", threedescision);
		return "applications";
	}
}
