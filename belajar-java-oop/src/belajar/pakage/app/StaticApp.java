package belajar.pakage.app;

import belajar.pakage.data.Application;
//import belajar.pakage.data.Constant;
import belajar.pakage.data.Country;
import belajar.pakage.util.MathUtil;

// static import
import static belajar.pakage.data.Constant.*;


public class StaticApp {
    static void main(String[] args) {

        //testing import static
        System.out.println(APPLICATION);
        System.out.println(VERAION);


        // ini static variabel
//        System.out.println(Constant.APPLICATION);
//        System.out.println(Constant.VERAION);

        // ini static method
        System.out.println(
                MathUtil.sum(1,2,3,4,5,6)
        );

        // ini static class
        Country.City city = new Country.City();
        city.setName("kalianda");

        System.out.println(city.getName());

        // ini yang static Block
        System.out.println(Application.PROCESSOR);


    }
}
