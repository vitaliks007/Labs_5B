package com.mireaHW.lab15_16.num2;

public class ATM implements Runnable {
    private Person person;
    private int count;
    private String mode;

    public ATM(Person person, int count, String mode) {
        this.person = person;
        this.count = count;
        this.mode = mode;
    }

    @Override
    public void run() {
        if (mode == "deposit") {
            person.deposit(count);
        } else if (mode == "withdraw"){
            person.withdraw(count);
        }
    }

    @Override
    public String toString() {
        return "ATM{" +
                "person=" + person +
                '}';
    }
}
