package com.mireaHW.lab9_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TopManager extends Employee implements EmployeePosition {
    public TopManager(String name, String subName, String jobTitle, double salary) {
        super(name, subName, jobTitle, salary);
    }

    public TopManager(Employee employee) {
        super(employee.getName(), employee.getSubName(), employee.getJob(), employee.getSalary());
    }

    @Override
    public String getJobTitle() {
        return this.getJob();
    }

    @Override
    public double calcSalary() {
        double bonusSalary = 0;
        double sum;
        //1.5 * this.getSalary()
        List<Employee> filteredEmp = this.getCompany().getStaff().stream()
                .filter(i -> i.getJob().equals("Manager") || i.getJob().equals("Operator"))
                .collect(Collectors.toList());

        return this.getSalary() + bonusSalary;
    }
}
