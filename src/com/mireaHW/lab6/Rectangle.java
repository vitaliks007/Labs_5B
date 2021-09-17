package com.mireaHW.lab6;

public class Rectangle {
    private Point rightUp;
    private Point leftDown;

    public Rectangle(Point rightUp, Point leftDown) {
        this.rightUp = rightUp;
        this.leftDown = leftDown;
    }

    public Point getRightUp() {
        return rightUp;
    }

    public void setRightUp(Point rightUp) {
        this.rightUp = rightUp;
    }

    public Point getLeftDown() {
        return leftDown;
    }

    public void setLeftDown(Point leftDown) {
        this.leftDown = leftDown;
    }
}
