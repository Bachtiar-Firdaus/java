package lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    static void main(String[] args) {

        Predicate<String> predicateCheckBlank = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isBlank();
            }
        };

        Predicate<String> predicateCheckBlank1 = s -> s.isBlank();

        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank1.test("a"));




    }
}
