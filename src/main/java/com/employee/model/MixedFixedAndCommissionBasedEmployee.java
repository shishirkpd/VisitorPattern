package com.employee.model;

public class MixedFixedAndCommissionBasedEmployee extends Employee {
    private Double fixedSalary;
    private Double commissionRate;
    private int salesVolume;

    public Double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(Double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public Double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }

    private Double calculateSalary(){
        return getFixedSalary() + (getCommissionRate() * getSalesVolume());
    }

    @Override
    public Double getSalary() {
        super.setSalary(calculateSalary());
        return super.getSalary();
    }
}
