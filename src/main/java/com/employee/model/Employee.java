package com.employee.model;

import com.employee.visitor.VisitorElement;
import com.employee.service.EmployeeVisitor;

public class Employee implements VisitorElement {
    private String id;
    private String name;
    private String department;
    private Double salary;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return this.salary;
    }


    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public double accept(EmployeeVisitor employeeVisitor) {
        return employeeVisitor.getSalary(this);
    }

    @Override
    public String acceptForJson(EmployeeVisitor employeeVisitor) {
        return employeeVisitor.createGson(this);
    }
}
