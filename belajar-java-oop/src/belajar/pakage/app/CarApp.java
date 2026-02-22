package belajar.pakage.app;

import belajar.pakage.data.Avanza;
import belajar.pakage.data.Car;

public class CarApp {
    static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
