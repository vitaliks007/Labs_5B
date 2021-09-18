package com.mireaHW.lab5;

public class CircleMovable extends Circle implements Movable {

    public CircleMovable(Point center, double radius) {
        super(center, radius);
    }

    @Override
    public void move(int x, int y)
    {
        this.setCenter(new Point(this.getCenter().getX() + x, this.getCenter().getY() + y));
    }
}
