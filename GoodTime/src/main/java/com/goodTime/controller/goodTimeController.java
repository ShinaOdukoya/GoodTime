package com.goodTime.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.goodTime.dao.ProviderDao;
import com.goodTime.domain.Provider;
import com.goodTime.service.ProviderService;


@Controller
public class goodTimeController {

//	@Autowired
//	private ProviderDao providerDao;
//	
	@Autowired
	private ProviderService providerService;
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/locations")
	public String location() {
		return "location";
	}
	
	@RequestMapping(value="/register")
	public String providerRegistration(@RequestParam("email")String providerEmail,
											@RequestParam("password") String password) {
		
		//ModelAndView mav = new ModelAndView();
		Provider provider = new Provider();
		provider.setEmail(providerEmail);
		provider.setPassword(password);
		
		providerService.registerProvider(provider);
		
		//mav.setViewName("location");
		return "welcome";
	}
}
