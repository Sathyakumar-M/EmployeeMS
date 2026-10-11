package com.spring.employee.application.EmployessMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.employee.application.EmployessMS.entity.Employee;
import com.spring.employee.application.EmployessMS.serice.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployee(@RequestBody Employee employee) {
		log.info("Add Employee");
		return employeeService.addEmployee(employee);		
	}
	
	@GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee(){
		log.info("Get All Employee");
		return employeeService.getAllEmployee();
	}
	
	@PutMapping(value="/update/{id}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
		log.info("Updated employee");
		return employeeService.updateEmployeeById(id, employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		log.info("Deleted employee by Id: "+id);
		return employeeService.deleteEmployeeById(id);
	}
}
