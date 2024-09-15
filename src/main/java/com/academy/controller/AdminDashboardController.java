package com.academy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminDashboardController {
	
    private static final Logger log = LoggerFactory.getLogger(AdminDashboardController.class);

	@RequestMapping("/")
	public String getLoginPage() {
		//Need to implement login page
		log.info("Loading login page...");
		return "redirect:/admin/dashboard";
	}

	@RequestMapping("/admin/dashboard")
	public String getAdminDashboardPage() {
		log.info("Loading admin dashboard page...");
		return "adminDashboard";
	}
}
