package com.iw.avo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
public class MainController {
	@RequestMapping("/")
	public String home(Model model) {
		log.info("Welcome to avocado home!");
		
		return "main/index";
	}
	/////////////////////////임시!//////////////////////////
	@RequestMapping("/header")
	public String header(Model model) {
		log.info("헤더 확인 좀!");
		
		return "main/header";
	}
}
