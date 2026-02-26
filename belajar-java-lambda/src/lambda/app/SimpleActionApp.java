package lambda.app;

import lambda.SimpleAction;

public class SimpleActionApp {
    static void main(String[] args) {

//        // versi normal
//        SimpleAction simpleAction = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Daus";
//            }
//        };
//
//        System.out.println(simpleAction.action("dika"));
//
//        // versi lambda
//        SimpleAction simpleAction1 = (String name) -> {
//            return "bachtiar";
//        };
//
//        System.out.println(simpleAction1.action("dani"));

        // ini lambda dengan block
        SimpleAction simpleAction1 = (String value) -> {
            return "Hello "+ value;
        };
        SimpleAction simpleAction2 = (name) -> {
            return "Hello "+ name;
        };

        // ini lambda tanpa block
        SimpleAction simpleAction11 = (String value) -> "Hello "+ value;
        SimpleAction simpleAction22 = (name) -> "Hello "+ name;
        SimpleAction simpleAction33 = name -> "Hello "+ name;

    }
}
