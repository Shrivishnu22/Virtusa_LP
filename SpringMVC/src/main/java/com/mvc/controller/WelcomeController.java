package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/")
public class WelcomeController {
	@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView welcome()
	{
		return new ModelAndView("welcomepage","welcomeMSG","You are viewing the First Page");
	}
		 
	@RequestMapping(value="/sec",method = RequestMethod.GET)
	public ModelAndView welcomeAgain()
	{
		return new ModelAndView("welcomepage","welcomeMSG","You are viewing the Second Page");
	}

}
