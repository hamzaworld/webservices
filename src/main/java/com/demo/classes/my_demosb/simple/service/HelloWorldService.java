/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.demo.classes.my_demosb.simple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.classes.my_demosb.simple.model.Employee;
import com.demo.classes.my_demosb.simple.repository.HomeRepository;

@Service
public class HelloWorldService {

	@Autowired
	HomeRepository repository;
	
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();	
	}

	public String saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		 repository.saveAndFlush(emp);
		 return"Record saved";
	}
}
