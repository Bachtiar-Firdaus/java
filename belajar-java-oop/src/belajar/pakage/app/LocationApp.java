package belajar.pakage.app;

import belajar.pakage.data.City;
import belajar.pakage.data.Location;

public class LocationApp {
    static void main(String[] args) {
//        var location = new Location(); Error
        var city = new City();
        city.name = "Lampung";
        System.out.println(city.name);
    }
}
