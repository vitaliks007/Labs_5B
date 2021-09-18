package com.mireaHW.lab7;

public class Mastiff extends Dog{
    public Mastiff(int subBreed) {
        super(subBreed, 4, 200);
    }

    @Override
    public void saturate(int amount){
        int hunger = this.getHunger();
        hunger += amount;

        if (hunger > 200){ // Overeating
            heal(-((hunger - 200) / 4));
            hunger = 200;
        } else if (hunger == 200){
            heal(99);
        }

        if (hunger <= 0) { // Goodbye, doggy!
            this.setHealth(0);
            hunger = 0;
        }

        this.setHunger(hunger);
    }

    @Override
    public String toString() {
        return super.toString() + " Mastiff{}";
    }
}
