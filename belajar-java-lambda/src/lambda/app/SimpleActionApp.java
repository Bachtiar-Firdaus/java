package lambda.app;

import lambda.SimpleAction;

public class SimpleActionApp {
    static void main(String[] args) {

        // versi normal
        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action() {
                return "Daus";
            }
        };

        System.out.println(simpleAction.action());

        // versi lambda
        SimpleAction simpleAction1 = () -> {
            return "bachtiar";
        };

        System.out.println(simpleAction1.action());

    }
}
