package belajar.pakage.app;

import belajar.pakage.data.Animal;
import belajar.pakage.data.Cat;

public class AnimalApp {
    static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
