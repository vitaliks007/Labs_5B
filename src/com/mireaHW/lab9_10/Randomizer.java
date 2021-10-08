package com.mireaHW.lab9_10;

public class Randomizer {
    public static double rand(double min, double max) {
        return Math.random() * (max - min + 1) + min;
    }
}
