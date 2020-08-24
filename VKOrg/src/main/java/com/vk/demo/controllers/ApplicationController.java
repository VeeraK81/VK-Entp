package com.vk.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

	
	@RequestMapping(method = RequestMethod.GET, value="/process")
	public String process(){
		
		return "processed.";
	}
	
}
