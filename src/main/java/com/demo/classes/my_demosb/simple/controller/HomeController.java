package com.demo.classes.my_demosb.simple.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.classes.my_demosb.simple.model.Employee;
import com.demo.classes.my_demosb.simple.service.HelloWorldService;

@RestController
@RequestMapping("/employee")
public class HomeController {

	@Autowired
	HelloWorldService homeService;
	
	@GetMapping("/getEmp")
	public Employee getEmployeeById(@RequestParam Integer id) {
		return homeService.getEmployeeById(id);
	}
	
	@PostMapping("/saveEmp")
	public String getEmployeeById(@RequestBody Employee emp) {
		return homeService.saveEmployee(emp);
	}
	
}
