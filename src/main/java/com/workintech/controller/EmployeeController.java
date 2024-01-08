package com.workintech.controller;

import com.workintech.entity.Employee;
import com.workintech.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployee() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable long id) {
        return employeeService.findById(id);
    }

    @GetMapping("/filter/{salary}")
    public List<Employee> getEmployeesBySalary(@PathVariable double salary) {
        return employeeService.findAllBySalary(salary);
    }

    @GetMapping("/order")
    public List<Employee> getEmployeesOrderedByLastName() {
        return employeeService.sortByLastName();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
        Employee foundEmployee = employeeService.findById(id);
        foundEmployee.setId(id);
        foundEmployee.setFirstName(employee.getFirstName());
        foundEmployee.setLastName(employee.getLastName());
        foundEmployee.setSalary(employee.getSalary());
        foundEmployee.setEmail(employee.getEmail());
        return employeeService.save(foundEmployee);
    }

    @DeleteMapping("/{id}")
    public Employee deleteEmployee(@PathVariable long id) {
        Employee foundEmployee = employeeService.findById(id);
        employeeService.delete(foundEmployee);
        return foundEmployee;
    }

}
