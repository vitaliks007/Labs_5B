package com.mireaHW.lab17_18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void num1(String input) {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher(input);
        boolean found = matcher.matches();
        if (found) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void num2(String input) {
        Pattern pattern = Pattern.compile("[a-fA-F0-9]{2}(:[a-fA-F0-9]{2}){5}");
        Matcher matcher = pattern.matcher(input);
        boolean found = matcher.matches();
        if (found) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void num3(String input) {
        Pattern pattern = Pattern.compile("\\d*\\.\\d{2}\\s(USD|RUR|EU)");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());
    }

    public static void main(String[] args) {
        //Text here
        Scanner scanner = new Scanner(System.in);
        num3(scanner.nextLine());

    }
}

