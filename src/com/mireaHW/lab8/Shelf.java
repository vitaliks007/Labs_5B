package com.mireaHW.lab8;

public class Shelf extends Furniture{
    private int bindType, style;

    public Shelf(int color, int size, int material, int bindType, int style) {
        super(color, size, material, size*material*42);
        this.bindType = bindType;
        this.style = style;
    }

    public int getBindType() {
        return bindType;
    }

    public int getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return super.toString() + "Shelf{" +
                "bindType=" + bindType +
                ", style=" + style +
                '}';
    }
}
