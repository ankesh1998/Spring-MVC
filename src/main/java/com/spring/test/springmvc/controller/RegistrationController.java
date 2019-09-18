package com.spring.test.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.test.springmvc.employee.pojo.Employee;

@Controller
public class RegistrationController {
//
//	@RequestMapping("/register")
//	public ModelAndView showRegister() {
//		
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("userRegistration");
//		return modelAndView;
//	}
//	
//	@RequestMapping(value = "/userRegistration",method = RequestMethod.POST)
//	public ModelAndView register(@ModelAttribute("employee") Employee emp) {
//		//System.out.println(emp);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("emp", emp);;
//		modelAndView.setViewName("regResult");
//		return modelAndView;
//	}
	
	
	
	@RequestMapping("/register")
	public String showRegister() {
		return "userRegistration";
		
	}
	
	@RequestMapping(value = "/userRegistration",method = RequestMethod.POST)
	public String register(@ModelAttribute("employee") Employee emp, ModelMap model) {
		//System.out.println(emp);
		model.addAttribute("emp", emp);
		return "regResult";
	}
}
