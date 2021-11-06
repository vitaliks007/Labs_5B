package com.mireaHW.lab15_16.num2;

public class Tester {
    public static void test() {
        Person person = new Person("1");
        Thread atm = new Thread(new ATM(person, 100, "deposit"));
        atm.start();
        person.deposit(100);
        System.out.println(person);
    }
}
