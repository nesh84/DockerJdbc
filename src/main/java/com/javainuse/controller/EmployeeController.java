package com.javainuse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;
import com.javainuse.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	//Below are list user in the application
	@GetMapping("/")
	public String home(){
		return "Employee Docker  Application - UP!";
	}

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getEmployees() {

		return empService.getAllEmployees();

	}

	@RequestMapping(value = "/insertemployee", method = RequestMethod.POST)
	public void insertEmployee(@RequestBody Employee employee) {
		empService.insertEmployee(employee);
	}

}
