
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();

        Animal dog1 = new Dog("Bobik", 4);
        Animal cat1 = new Cat("Murka", 3);

        shelter.addAnimal(dog1);
        shelter.addAnimal(cat1);

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("\n===== PET SHELTER =====");
            System.out.println("What do you want to do?");
            System.out.println("1. Show all animals");
            System.out.println("2. Add a new animal");
            System.out.println("3. Feed all animals");
            System.out.println("4. Make animals sound");
            System.out.println("5. Show animal count");
            System.out.println("0. Exit");
            System.out.println("=======================");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> shelter.showAnimals();

                case 2 -> {
                    System.out.println("1. Cat");
                    System.out.println("2. Dog");
                    System.out.print("Choose animal: ");

                    int animalType = scanner.nextInt();

                    if (animalType != 1 && animalType != 2) {
                        System.out.println("Unknown animal type!");
                        break;
                    }

                    System.out.print("Enter name: ");
                    String name = scanner.next();

                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();

                    if (animalType == 1) {
                        shelter.addAnimal(new Cat(name, age));
                    } else {
                        shelter.addAnimal(new Dog(name, age));
                    }

                    System.out.println("Animal added!");
                }

                case 3 -> shelter.feedAll();

                case 4 -> shelter.makeSound    ();

                case 5 -> System.out.println(
                        "Animals in shelter: " + shelter.getCount()
                );

                case 0 -> {
                    System.out.println("Goodbye!");
                    flag = false;
                }

                default -> System.out.println("Unknown command!");
            }
        }

        scanner.close();
    }
}
