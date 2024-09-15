package com.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminDashboardController {

	@RequestMapping("/")
	public String getLoginPage() {
		//Need to implement login page
		return "redirect:/admin/dashboard";
	}

	@RequestMapping("/admin/dashboard")
	public String getAdminDashboardPage() {
		return "adminDashboard";
	}
}
