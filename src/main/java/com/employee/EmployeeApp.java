package com.employee;

import com.employee.model.CommissionBasedEmployee;
import com.employee.model.FixedSalaryEmployee;
import com.employee.model.MixedFixedAndCommissionBasedEmployee;
import com.employee.visitor.VisitorElement;
import com.employee.service.EmployeeVisitor;
import com.employee.service.EmployeeVisitorImpl;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {

        FixedSalaryEmployee fse = new FixedSalaryEmployee();
        fse.setId("1");
        fse.setName("Fixed");
        fse.setDepartment("Account");
        fse.setFixedSalary(1000.00);

        CommissionBasedEmployee cbe = new CommissionBasedEmployee();
        cbe.setId("2");
        cbe.setName("Commission");
        cbe.setDepartment("Vendor");
        cbe.setCommissionRate(.2);
        cbe.setSalesVolume(3000);

        MixedFixedAndCommissionBasedEmployee mfcbe = new MixedFixedAndCommissionBasedEmployee();
        mfcbe.setId("3");
        mfcbe.setName("Mixed");
        mfcbe.setDepartment("Contractor");
        mfcbe.setFixedSalary(700.00);
        mfcbe.setCommissionRate(.1);
        mfcbe.setSalesVolume(250);

        VisitorElement[] elements = new VisitorElement[] {fse, cbe, mfcbe};


        System.out.println("--------------------" );
        System.out.println("Total Salary of employees are: " + calculateTotalSalary(elements));

        System.out.println("--------------------" );
        System.out.println("Json output: " + printJson(elements));

    }

    private static double calculateTotalSalary(VisitorElement[] elements) {
        EmployeeVisitor visitor = new EmployeeVisitorImpl();
        double sum=0;
        for(VisitorElement element : elements){
            sum = sum + element.accept(visitor);
        }
        return sum;
    }

    private static List<String> printJson(VisitorElement[] elements) {
        List<String> res = new ArrayList<>();
        EmployeeVisitor visitor = new EmployeeVisitorImpl();
        for(VisitorElement element : elements){
            res.add(element.acceptForJson(visitor));
        }
        return res;
    }
}
