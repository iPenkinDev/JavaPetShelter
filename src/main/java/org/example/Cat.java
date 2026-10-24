package org.example;

public class Cat extends Animal {
    protected Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

}
