package org.example;
import java.util.List;
import java.util.ArrayList;

public class Shelter {
    private final List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void feedAll(){
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    void makeSound(){
        for (Animal animal : animals){
            animal.sound();
        }
    }

    public int getCount() {
        if (animals.isEmpty()){
            System.out.println("Shelter is empty");
        }
        return animals.size();
    }

    public void showAnimals() {
        for (Animal animal : animals) {
            System.out.println(
                    animal.getName() + ", age: " + animal.getAge()
            );
        }
    }

}
