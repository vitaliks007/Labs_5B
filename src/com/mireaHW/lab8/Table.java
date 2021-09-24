package com.mireaHW.lab8;

public class Table extends Furniture{
    private int legsCount, legsType, height;

    public Table(int color, int size, int material, int legsCount, int legsType, int height) {
        super(color, size, material, size*material*117);
        this.legsCount = legsCount;
        this.legsType = legsType;
        this.height = height;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public int getLegsType() {
        return legsType;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return super.toString() + "Table{" +
                "legsCount=" + legsCount +
                ", legsType=" + legsType +
                ", height=" + height +
                '}';
    }
}
