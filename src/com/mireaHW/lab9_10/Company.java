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

    public ArrayList<Employee> getStaff() {
        return staff;
    }

    public double getIncome() {
        return this.income;
    }

    List getTopSalaryStaff(int count){
        ErrorCatcher.employeesCountException(this, count);
        return this.getStaff().stream().sorted(Comparator.comparing(Employee::getIncomeOne))
                .collect(Collectors.toList());
    }

    List getLowestSalaryStaff(int count){
        ErrorCatcher.employeesCountException(this, count);
        return this.getStaff().stream().sorted(Comparator.comparing(Employee::getIncomeOne).reversed())
                .collect(Collectors.toList());
    }
}
