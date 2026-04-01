package com.ehr.ehr_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EhrController {

	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "hello!!!");
		return "hello";
	}
}
