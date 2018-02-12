package com.maryanto.dimas.example.entity;

import java.math.BigDecimal;

public class Employee {

    public Employee() {
    }

    public Employee(Integer id, String firstName, String lastName, BigDecimal salary, Double commissionPct) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.commissionPct = commissionPct;
    }

    private Integer id;
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private Double commissionPct;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Double getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(Double commissionPct) {
        this.commissionPct = commissionPct;
    }
}
