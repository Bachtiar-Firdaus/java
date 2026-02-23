package belajar.pakage.app;

import belajar.pakage.annotation.Fancy;
import belajar.pakage.data.Animal;
import belajar.pakage.data.Cat;

@Fancy(name = "animals", tags = {"app", "java"})
public class AnimalApp {
    static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
