package com.mireaHW.lab7;

public class DixieCup extends Dish{
    public int deathCount;

    public DixieCup(int depth, int size) {
        super(depth, size, 1);
        this.deathCount = 0;
    }

    public void use(){
        this.setDurability(this.getDurability() - 8);
        if (this.getDurability() <= 0) {
            recycle();
        }
    }

    public void recycle(){
        this.deathCount++;
        if (this.deathCount <= 16) {
            this.setDurability(16 - deathCount);
        }
    }

    public int getDeathCount() {
        return deathCount;
    }

    @Override
    public String toString() {
        return super.toString() + " DixieCup{" +
                "deathCount=" + deathCount +
                '}';
    }
}
