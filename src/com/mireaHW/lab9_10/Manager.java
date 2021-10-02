package com.mireaHW.lab9_10;

public class Manager extends Employee implements EmployeePosition{
    public Manager(String name, String subName, String jobTitle, int salary) {
        super(name, subName, jobTitle, salary);
    }

    public Manager(Employee employee) {
        super(employee.getName(), employee.getSubName(), employee.getJob(), employee.getSalary());
    }

    @Override
    public String getJobTitle() {
        return this.getJob();
    }

    @Override
    public double calcSalary() {
        return this.getSalary() + this.getIncomeOne() * 0.05;
    }


}
