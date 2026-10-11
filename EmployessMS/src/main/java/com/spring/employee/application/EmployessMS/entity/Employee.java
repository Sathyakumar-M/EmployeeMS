package com.spring.employee.application.EmployessMS.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "employee_t_2026")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	private int id;
	private String name;
	private LocalDate dob;
	private int age;
	private double salary;
	private String company;
	

}
