package com.tematihonov;

public class Plate {
    private  int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("В тарелке осталось еды: " + food);
    }


    public void decreaseFood(int n){
            food-=n;
    }

    public void addFood(int qty){
        food+=qty;
    }
    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }


}
