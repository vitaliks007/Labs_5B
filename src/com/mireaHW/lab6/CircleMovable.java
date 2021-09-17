package com.mireaHW.lab6;

public class CircleMovable extends Circle implements Movable {

    public CircleMovable(Point center, double radius) {
        super(center, radius);
    }

    @Override
    public void move(int x, int y)
    {
        Point center = new Point(this.getCenter().getX() + x, this.getCenter().getY() + y);
        this.setCenter(center);
    }
}
