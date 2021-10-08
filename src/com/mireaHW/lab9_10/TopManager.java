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

        sum = this.getCompany().getStaff().stream()
                .filter(i -> i.getJob().equals("Manager") || i.getJob().equals("Operator"))
                .mapToDouble(Employee::getSalary).sum();

        if (sum > 10000000) {
            bonusSalary = 1.5 * this.getSalary();
        }

        return this.getSalary() + bonusSalary;
    }
}
