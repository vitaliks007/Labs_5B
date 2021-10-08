package com.mireaHW.lab9_10;

public abstract class Employee {
    private String name, subName, job;
    private double salary, incomeOne;
    private Company company;

    public Employee(String name, String subName, String job, double salary) {
        this.name = name;
        this.subName = subName;
        this.job = job;
        this.salary = salary;
        this.incomeOne = Randomizer.rand(115000, 140000);
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String getSubName() {
        return subName;
    }

    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }

    public double getIncomeOne() {
        return incomeOne;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", subName='" + subName + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", incomeOne=" + incomeOne +
                ", company=" + company +
                '}';
    }
}
