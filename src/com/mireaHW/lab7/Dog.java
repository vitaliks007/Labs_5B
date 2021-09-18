package com.mireaHW.lab7;

public abstract class Dog {
    private int subBreed, health, legLength, hunger;

    public Dog(int subBreed, int legLength, int hunger) {
        this.subBreed = subBreed;
        this.health = 100;
        this.legLength = legLength;
        this.hunger = hunger;
    }

    public void heal(int amount) { //amount from 1 to 99
        this.health += amount;
        if (this.health > 100){
            this.health = 0;
        }
    }

    public abstract void saturate(int amount); //How template this for various const in other class?

    public int getSubBreed() {
        return subBreed;
    }

    public int getHealth() {
        return health;
    }

    public int getLegLength() {
        return legLength;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "subBreed=" + subBreed +
                ", health=" + health +
                ", legLength=" + legLength +
                ", hunger=" + hunger +
                '}';
    }
}
