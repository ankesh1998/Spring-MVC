package com.spring.test.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.test.springmvc.employee.pojo.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/getEmp")
	public ModelAndView setEmployee() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("getEmployee");
		Employee employee = new Employee();
		employee.setId(18);
		employee.setName("Sameer Pandey");
		employee.setContact("8318251190");

		modelAndView.addObject("emp",employee);
		return modelAndView;
	}
}
