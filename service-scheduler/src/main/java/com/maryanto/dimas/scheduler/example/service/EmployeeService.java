package com.maryanto.dimas.scheduler.example.service;

import com.maryanto.dimas.scheduler.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String jumlahEmployee() {
        Integer jumlah = this.employeeRepository.count();
        return String.format("jumlah karyawan ada %s", jumlah);
    }
}
