package com.mireaHW.lab9_10;

public class Manager extends Employee implements EmployeePosition{

    @Override
    public String getJobTitle() {
        return null;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return 0;
    }
}
