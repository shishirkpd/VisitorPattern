package com.employee.visitor;

import com.employee.service.EmployeeVisitor;

public interface VisitorElement {
    double accept(EmployeeVisitor employeeVisitor);
    String acceptForJson(EmployeeVisitor employeeVisitor);
}
