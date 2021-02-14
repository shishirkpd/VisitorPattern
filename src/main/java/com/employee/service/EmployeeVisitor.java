package com.employee.service;

import com.employee.model.Employee;

public interface EmployeeVisitor {
	double getSalary(Employee employee);
	String createGson(Employee employee);
}