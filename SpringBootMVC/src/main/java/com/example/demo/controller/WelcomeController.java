package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.WelcomeService;

@Controller
@RequestMapping(value = { "/", "/home", "/create" })
public class WelcomeController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("welcomepage", "welcomeMSG", "Vishnu");
	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public ModelAndView error() {
		return new ModelAndView("error");
	}

	@Autowired
	WelcomeService welcomeService;

	@RequestMapping(value = "/one", method = RequestMethod.GET)
	public ModelAndView welcomeMsg1() {
		return new ModelAndView("welcomepage", "welcomeMSG", welcomeService.fisrtMsg());
	}

	@RequestMapping(value = "/two", method = RequestMethod.GET)
	public ModelAndView welcomeMsg2() {
		return new ModelAndView("welcomepage", "welcomeMSG", welcomeService.secMsg());
	}

	@RequestMapping(value = "/user/{username}/{age}", method = RequestMethod.GET)
	public ModelAndView getData(@PathVariable("username") String username, @PathVariable("age") int age,
			@RequestParam("gender") String gender) {
		return new ModelAndView("welcomepage", "welcomeMSG",
				"hey ! " + username + ". Your age is  " + age + " and gender is " + gender);
	}

	@RequestMapping(value = "{domainName}", method = RequestMethod.GET)
	public ModelAndView getData(@PathVariable("domainName") String domainNname) {
		return new ModelAndView("welcomepage", "welcomeMSG", "Domain name is: " + domainNname);
	}

	@RequestMapping(value = "{userName}/{age}", method = RequestMethod.GET)
	public ModelAndView getData(@PathVariable Map<String, String> pathMaps, @RequestParam String gender) {// @PathVariable("userName")String
																											// userNname,@PathVariable("age")String
																											// age
		String userName = pathMaps.get("userName");
		int age = Integer.parseInt(pathMaps.get("age"));
		return new ModelAndView("welcomepage", "welcomeMSG", "details: " + userName + " " + age + " " + gender);
	}

}
