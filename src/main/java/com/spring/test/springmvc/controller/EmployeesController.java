package com.spring.test.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.test.springmvc.employee.pojo.Employee;

@Controller
public class EmployeesController {

	@RequestMapping("/getAllEmp")
	public ModelAndView setEmployee() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("getAllEmployee");
		Employee employee = new Employee();
		employee.setId(18);
		employee.setName("Sameer Pandey");
		employee.setContact("8318251190");
		
		Employee employee2 = new Employee();
		employee2.setId(20);
		employee2.setName("Ankit Singh");
		employee2.setContact("8324847671");
		
		Employee employee3 = new Employee();
		employee3.setId(103);
		employee3.setName("Shashank");
		employee3.setContact("9122251190");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		list.add(employee2);
		list.add(employee3);

		modelAndView.addObject("employees",list);
		return modelAndView;
	}
}
