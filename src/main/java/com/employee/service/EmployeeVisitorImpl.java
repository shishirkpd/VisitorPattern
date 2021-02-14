package com.employee.service;

import com.employee.model.Employee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EmployeeVisitorImpl  implements  EmployeeVisitor {
    @Override
    public double getSalary(Employee employee) {
        return employee.getSalary();
    }

    @Override
    public String createGson(Employee employee) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(employee);
    }
}
