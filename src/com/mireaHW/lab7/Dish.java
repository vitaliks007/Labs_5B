package com.mireaHW.lab7;

public abstract class Dish {
    private int depth, size, material, durability;

    public Dish(int depth, int size, int material, int durability) {
        this.depth = depth;
        this.size = size;
        this.material = material;
        this.durability = durability;
    }

    public Dish(int depth, int size, int material) {
        this.depth = depth;
        this.size = size;
        this.material = material;
        this.durability = material * 16;
    }

    public int getDepth() {
        return depth;
    }

    public int getSize() {
        return size;
    }

    public int getMaterial() {
        return material;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "depth=" + depth +
                ", size=" + size +
                ", material=" + material +
                ", durability=" + durability +
                '}';
    }
}
