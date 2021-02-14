package com.employee.model;

public class CommissionBasedEmployee extends Employee {
    Double commissionRate;
    int salesVolume;

    public int getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }

    public Double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public Double getSalary() {
        super.setSalary(calculateSalary());
        return super.getSalary();
    }

    private Double calculateSalary() {
        return getSalesVolume() * getCommissionRate();
    }
}
