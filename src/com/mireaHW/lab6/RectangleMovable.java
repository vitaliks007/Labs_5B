package com.mireaHW.lab6;

public class RectangleMovable extends Rectangle implements Movable {
    public RectangleMovable(Point rightUp, Point leftDown) {
        super(rightUp, leftDown);
    }

    @Override
    public void move(int x, int y) {
        setRightUp( new Point(this.getRightUp().getX() + x, this.getRightUp().getY() + y));
        setLeftDown( new Point(this.getLeftDown().getX() + x, this.getLeftDown().getY() + y));
    }
}