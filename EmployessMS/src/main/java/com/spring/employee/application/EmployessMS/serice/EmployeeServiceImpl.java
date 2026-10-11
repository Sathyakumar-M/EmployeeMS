package com.spring.employee.application.EmployessMS.serice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.employee.application.EmployessMS.entity.Employee;
import com.spring.employee.application.EmployessMS.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployeeById(int id, Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public String deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
		return "Updated successfully";
	}

}
