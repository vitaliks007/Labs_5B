package com.mireaHW.lab5;

public class Main {

    public static void main(String[] args) {
        CircleMovable circleMovable = new CircleMovable(new Point(1,1), 10f);
        PointMovable pointMovable = new PointMovable(10,10);

        System.out.println(pointMovable);
        pointMovable.move(12,19);
        System.out.println(pointMovable);

        System.out.println(circleMovable);
        circleMovable.move(32, 22);
        System.out.println(circleMovable);
    }
}
