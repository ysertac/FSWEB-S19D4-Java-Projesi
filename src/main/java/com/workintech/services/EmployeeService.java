package com.workintech.services;

import com.workintech.entity.Employee;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(long id);

    Employee findByEmail(String email);

    List<Employee> findAllBySalary(double salary);

    List<Employee> sortByLastName();

    Employee save(Employee employee);

    Employee delete(Employee employee);

}
