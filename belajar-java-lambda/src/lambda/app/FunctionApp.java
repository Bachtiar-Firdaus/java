package lambda.app;

import java.util.function.Function;

public class FunctionApp {
    static void main(String[] args) {

        // menggunakan dari util function
        Function<String, Integer> functionLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        // function di tandem dengan lambda
        Function<String, Integer> functionLength1 = s -> s.length();


        System.out.println(functionLength.apply("Bachtiar"));
        System.out.println(functionLength1.apply("Bachtiar"));



    }
}
