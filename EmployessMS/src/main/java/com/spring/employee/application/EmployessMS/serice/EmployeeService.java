package  com.spring.employee.application.EmployessMS.serice;

import java.util.List;

import com.spring.employee.application.EmployessMS.entity.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	
	List<Employee> getAllEmployee();
	
	Employee updateEmployeeById(int id, Employee employee);
	
	String deleteEmployeeById(int id);

}
