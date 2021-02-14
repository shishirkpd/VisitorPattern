package com.employee.model;

public class FixedSalaryEmployee extends Employee {

    private Double fixedSalary;

    public Double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(Double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public Double getSalary() {
        super.setSalary(getFixedSalary());
        return super.getSalary();
    }
}
