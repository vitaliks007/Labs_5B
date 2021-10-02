package com.mireaHW.lab9_10;

public class Employee{
    private String name, subName, job;
    private int salary;

    public Employee(String name, String subName, String job, int salary) {
        this.name = name;
        this.subName = subName;
        this.job = job;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }
}
