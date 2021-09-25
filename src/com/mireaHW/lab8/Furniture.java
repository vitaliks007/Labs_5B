package com.mireaHW.lab8;

public abstract class Furniture {
    private int color, size, material, price;

    public Furniture(int color, int size, int material, int price) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.price = price;
    }

    public int getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "color=" + color +
                ", size=" + size +
                ", material=" + material +
                '}';
    }
}
