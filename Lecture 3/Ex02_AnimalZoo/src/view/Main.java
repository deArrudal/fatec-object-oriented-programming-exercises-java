package view;

import java.util.ArrayList;

import model.Animal;
import model.Fish;
import model.Mammal;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();

        Animal camel = new Animal();
        camel.setAnimalName("Camel");
        camel.setAnimalSize(150);
        camel.setAnimalColor("Yellow");
        camel.setAnimalEnvironment("Land");
        camel.setAnimalSpeed(2.0f);
        zoo.add(camel);

        Fish shark = new Fish();
        shark.setAnimalName("Shark");
        shark.setAnimalSize(300);
        shark.setAnimalSpeed(1.5f);
        zoo.add(shark);

        Mammal canBear = new Mammal();
        canBear.setAnimalName("Canadian Bear");
        canBear.setAnimalSize(180);
        canBear.setAnimalColor("Red");
        canBear.setAnimalSpeed(0.5f);
        canBear.setMammalFood("Honey");
        zoo.add(canBear);

        System.out.println("Zoo:");
        System.out.println("--------------------");
        for (Animal animal : zoo) {
            System.out.println(animal.printAnimalData());
            System.out.println("--------------------");
        }

    }
}