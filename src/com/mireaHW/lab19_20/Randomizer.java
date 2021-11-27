package com.mireaHW.lab19_20;

public class Randomizer {
    public static double rand(double min, double max) {
        return Math.random() * (max - min + 1) + min;
    }

    public static int rand(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
}
