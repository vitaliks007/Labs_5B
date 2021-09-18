package com.mireaHW.lab7;

public class Main {

    public static void main(String[] args) {
        //Text here
        DixieCup dixieCup = new DixieCup(4, 1);
        dixieCup.use();
        dixieCup.recycle();
        dixieCup.use();
        System.out.println(dixieCup);

        Plate plate = new Plate(2,4);
        plate.use();
        plate.use();
        plate.wash(32);
        plate.use();
        System.out.println(plate);

        Mastiff mastiff = new Mastiff(3);
        mastiff.saturate(34); // Not r
        System.out.println(mastiff);

        Dachshund dachshund = new Dachshund(1);
        dachshund.saturate(-117); // Food poisoning (web cookies?)
        System.out.println(dachshund);
    }
}
