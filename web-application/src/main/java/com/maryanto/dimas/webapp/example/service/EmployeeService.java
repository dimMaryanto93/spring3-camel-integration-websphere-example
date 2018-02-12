package com.maryanto.dimas.webapp.example.service;

import com.maryanto.dimas.webapp.example.entity.Employee;
import com.maryanto.dimas.webapp.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String fullnameById(Integer employeeId) {
        return this.employeeRepository.lastNameByEmployeeId(employeeId);
    }

    public Employee findById(Integer employeeId) {
        return this.employeeRepository.findById(employeeId);
    }
}
