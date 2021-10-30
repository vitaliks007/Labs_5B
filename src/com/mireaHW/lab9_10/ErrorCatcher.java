package com.mireaHW.lab9_10;

import java.io.IOException;

public class ErrorCatcher {
    public static boolean employeesCountException(Company company, int count) {
        boolean err = false;
        try {
            company.getStaff().get(count - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Incorrect count!");
            err = true;
        }
        return err;
    }
}
