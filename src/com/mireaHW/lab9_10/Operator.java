package com.mireaHW.lab9_10;

public class Operator extends Employee implements EmployeePosition{

    public Operator(String name, String subName, String job, double salary) {
        super(name, subName, job, salary);
    }

    public Operator(Employee employee) {
        super(employee.getName(), employee.getSubName(), employee.getJob(), employee.getSalary());
    }

    @Override
    public String getJobTitle() {
        return this.getJob();
    }

    @Override
    public double calcSalary() {
        return this.getSalary();
    }
}
