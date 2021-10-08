package com.mireaHW.lab9_10;

import java.io.IOException;

public class ErrorCatcher {
    public static void employeesCountException(Company company, int count) {
        try {
            company.getStaff().get(count - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Incorrect count!");
        }
    }
}
