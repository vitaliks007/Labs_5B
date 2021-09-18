package com.mireaHW.lab7;

public class Dachshund extends Dog{ //Is this a german name?
    public Dachshund(int subBreed) {
        super(subBreed, 1, 100);
    }

    @Override
    public void saturate(int amount){
        int hunger = this.getHunger();
        hunger += amount;

        if (hunger > 100){ // Overeating
            heal(-(hunger - 100));
            hunger = 100;
        } else if (hunger == 100){
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
        return super.toString() + " Dachshund{}";
    }
}
