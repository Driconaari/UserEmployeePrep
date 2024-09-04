package com.example.useremployeeprep.service;

import com.example.useremployeeprep.model.Employee;
import com.example.useremployeeprep.repositories.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private Employeerepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(int id, Employee employeeDetails) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            employee.setName(employeeDetails.getName());
            employee.setGender(employeeDetails.getGender());
            // Set other fields as necessary
            return employeeRepository.save(employee);
        } else {
            return null;
        }
    }

    public boolean deleteEmployee(int id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}