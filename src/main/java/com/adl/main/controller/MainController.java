package com.adl.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.adl.main.model.AllCovidInfoModel;
import com.adl.main.services.CovidApiService;


@Controller
public class MainController {
	
	@Autowired
	CovidApiService covidService;
	
	
	@GetMapping("/")
	public String index(Model model) {
		List<AllCovidInfoModel>lstInfo=covidService.getAllCovidInfo();
		model.addAttribute("allCovidInfo",lstInfo);
		for(AllCovidInfoModel allCovidInfo:lstInfo) {
			System.out.println(allCovidInfo.toString());
		}
		return "index";
	}
	
	@GetMapping("/countries")
	public String countries() {
		
		return "countries";
	}
	
	@GetMapping("/faqs")
	public String faqs() {
		
		return "faqs";
	}
	
	@GetMapping("/prevention")
	public String prevention() {
		
		return "prevention";
	}
	
	@GetMapping("/symptoms")
	public String symptoms() {
		
		return "symptoms";
	}


}
