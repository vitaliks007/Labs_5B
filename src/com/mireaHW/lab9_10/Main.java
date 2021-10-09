package com.mireaHW.lab9_10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Text here
        Company company = new Company();
        for (int i = 0; i < 180; i++) {
            company.hire(new Operator(Integer.toString(i), Integer.toString(i), "Operator",
                    Randomizer.rand(12000, 20000)));
        }
        for (int i = 0; i < 80; i++) {
            company.hire(new Manager(Integer.toString(i), Integer.toString(i), "Manager",
                    Randomizer.rand(15000, 30000)));
        }
        for (int i = 0; i < 10; i++) {
            company.hire(new TopManager(Integer.toString(i), Integer.toString(i), "TopManager",
                    Randomizer.rand(20000, 100000)));
        }

        System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));

        company.fireCount(company.getStaff().size() / 2);

        System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));

    }
}

