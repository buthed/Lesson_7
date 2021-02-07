package com.tematihonov;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Random random = new Random();
        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; i++) {
            String b = String.valueOf("Кот " + i );
            cats[i] = new Cat(b, random.nextInt(8));
        }
        Plate plate = new Plate(20);

        //сколько изначально еды в тарелки
        plate.info();

        //коты трапезничают
        for (Cat cat: cats) {
            cat.eat(plate);
            cat.info();
            plate.info();
        }

        //добавление еды
        plate.addFood(10);
        plate.info();
    }
}

