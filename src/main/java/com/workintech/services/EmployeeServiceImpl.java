package com.workintech.services;

import com.workintech.entity.Employee;
import com.workintech.repository.EmployeeRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepostiory employeeRepostiory;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepostiory employeeRepostiory) {
        this.employeeRepostiory = employeeRepostiory;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepostiory.findAll();
    }

    @Override
    public Employee findById(long id) {
        Optional<Employee> optionalEmployee = employeeRepostiory.findById(id);
        if (optionalEmployee.isPresent()) {
            return optionalEmployee.get();
        }
        throw new RuntimeException("Employee not found with this id: " + id);
    }

    @Override
    public Employee findByEmail(String email) {
        Optional<Employee> optionalEmployee = employeeRepostiory.findByEmail(email);
        if (optionalEmployee.isPresent()) {
            return optionalEmployee.get();
        }
        throw new RuntimeException("Employee not found with this e-mail: " + email);
    }

    @Override
    public List<Employee> findAllBySalary(double salary) {
        return employeeRepostiory.findBySalary(salary);
    }

    @Override
    public List<Employee> sortByLastName() {
        return employeeRepostiory.sortByLastName();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepostiory.save(employee);
    }

    @Override
    public Employee delete(Employee employee) {
        employeeRepostiory.delete(employee);
        return employee;
    }
}
