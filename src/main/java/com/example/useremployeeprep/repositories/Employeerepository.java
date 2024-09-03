package com.example.useremployeeprep.repositories;


import com.example.useremployeeprep.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee, Integer> {
}
