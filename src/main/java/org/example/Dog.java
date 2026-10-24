package org.example;

public class Dog extends Animal {
    protected Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }

}
