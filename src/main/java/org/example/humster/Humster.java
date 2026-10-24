package org.example.humster;


import org.example.Animal;

public class Humster extends Animal {
    public Humster(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Pic-Pic");
    }

}