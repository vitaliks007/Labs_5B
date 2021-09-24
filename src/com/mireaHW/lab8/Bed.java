package com.mireaHW.lab8;

public class Bed extends Furniture{
    private  int springType, legsType;

    public Bed(int color, int size, int material, int springType, int legsType) {
        super(color, size, material, material*size*100);
        this.springType = springType;
        this.legsType = legsType;
    }

    public int getSpringType() {
        return springType;
    }

    public int getLegsType() {
        return legsType;
    }

    @Override
    public String toString() {
        return super.toString() + "Bed{" +
                "springType=" + springType +
                ", legsType=" + legsType +
                '}';
    }
}
