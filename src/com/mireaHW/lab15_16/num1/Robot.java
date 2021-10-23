package com.mireaHW.lab15_16.num1;

public class Robot{
    private Thread leftLeg = new Thread(new Leg("LEFT", this));
    private Thread rightLeg = new Thread(new Leg("RIGHT", this));
    //private Leg leftLeg = new Leg("LEFT", this);
    //private Leg rightLeg = new Leg("RIGHT", this);

    public void step() {
     //   while (true) {
            leftLeg.start();
            rightLeg.start();
       // }
    }
}
