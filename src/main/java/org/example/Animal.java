package org.example;

public abstract class Animal {
    private final String name;
    private final int age;

    protected Animal(String name, int age){
        this.name = name;
        if (age >= 0) {
            this.age = age;
        }
        else {
            this.age = 67;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void eat(){
        System.out.println("Was fed");
    }

    public void sound() {}
}
