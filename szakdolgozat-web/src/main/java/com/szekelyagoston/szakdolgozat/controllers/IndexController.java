package com.szekelyagoston.szakdolgozat.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public @ResponseBody ModelAndView indexPage(HttpServletRequest request,
			HttpServletResponse response){
		ModelAndView mw = new ModelAndView("index");
		return mw;
	}
}
