package com.demo.classes.my_demosb.simple.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.classes.my_demosb.simple.service.HelloWorldService;

@RestController
@RequestMapping("/employee")
public class HomeController {

	//@RequestMapping(value = "/message", method = RequestMethod.GET)
	/*
	 * RequestParam  done   /message?id=101
	 * PathVariable  done    /message/101
	 */
	/*
	 * @GetMapping("/record/{id}") public String getRecord(@PathVariable(value =
	 * "id") String identify) { return "Sending record for employee "+ identify; }
	 */
	@Autowired
	HelloWorldService service;
	
	
	@GetMapping("/record")  
	public String getRecord1(@RequestParam(value ="id") String idyy, @RequestParam(value = "name") String name) {
		
		
		return service.getEmployeeByIdAndName(idyy, name);
	}
	
}
