package com.szekelyagoston.szakdolgozat.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public void indexPage(){
		System.out.println("ads");
	}
}
