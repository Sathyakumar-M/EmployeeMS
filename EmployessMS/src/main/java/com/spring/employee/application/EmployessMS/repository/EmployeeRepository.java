package  com.spring.employee.application.EmployessMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.employee.application.EmployessMS.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
