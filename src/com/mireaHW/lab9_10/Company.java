package com.mireaHW.lab9_10;

import java.util.ArrayList;

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
}
