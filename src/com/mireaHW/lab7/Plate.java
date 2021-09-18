package com.mireaHW.lab7;

public class Plate extends Dish{
    private int dirt;

    public Plate(int depth, int size) {
        super(depth, size, 4);
        this.dirt = 0;
    }

    public void use(){
        this.setDurability(this.getDurability() - (2 + dirt));
        this.dirt += Math.random()*8;
    }

    public void wash(double quality){ //quality from 1 to 63
        this.dirt = (int)Math.ceil((double)this.dirt / (64 / (64 - quality)));
    }

    public int getDirt() {
        return dirt;
    }

    @Override
    public String toString() {
        return super.toString() + " Plate{" +
                "dirt=" + dirt +
                '}';
    }
}
