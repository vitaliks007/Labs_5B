package com.mireaHW.lab15_16.num2;

public class Person {
    private String name;
    private int cash = 0;

    public Person(String name) {
        this.name = name;
    }

    public int getCash() {
        return cash;
    }

    public synchronized void deposit(int count) {
        this.cash += count;
    }

    public synchronized void withdraw(int count) {
        if (this.cash >= count)
            this.cash -= count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cash=" + cash +
                '}';
    }
}