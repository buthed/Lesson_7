package com.tematihonov;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate){
        if (appetite < plate.getFood()) {
            plate.decreaseFood(appetite);
            satiety = true;
        } else {
            System.out.println("Кот пытается съесть больше, чем есть еды в тарелке");
        }

    }

    public void info() {
        System.out.println(name + " хочет поесть " + appetite + " еды");
    };

}
