package com.mireaHW.lab9_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Company {
    private ArrayList<Employee> staff = new ArrayList<>();
    private double income = 0;

    public void hire(Employee employee) {
        employee.setCompany(this);
        this.staff.add(employee);
        this.income += employee.getIncomeOne();
    }

    public void hireAll(ArrayList<Employee> staffExterior) {
        this.staff.addAll(staffExterior);
        staffExterior.forEach((s) -> this.income += s.getIncomeOne());
    }

    public void fire(int index) {
        this.staff.remove(index);
        this.income -= this.staff.get(index).getIncomeOne();
    }

    public void fireCount(int count) {
        if (!ErrorCatcher.employeesCountException(this, count)) {
            for (int i = 0; i < count; i++) {
                fire(i);
            }
        }
    }

    public ArrayList<Employee> getStaff() {
        return staff;
    }

    public double getIncome() {
        return this.income;
    }

    List getLowestSalaryStaff(int count){
        if (!ErrorCatcher.employeesCountException(this, count)) {
            return this.getStaff().stream().sorted(Comparator.comparing(Employee::getSalary))
                    .limit(count).collect(Collectors.toList());
        } else {
            return null;
        }
    }

    List getTopSalaryStaff(int count){
        if (!ErrorCatcher.employeesCountException(this, count)) {
            return this.getStaff().stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                    .limit(count).collect(Collectors.toList());
        } else {
            return null;
        }
    }
}