package lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForeachApp {
    static void main(String[] args) {

        List<String> list = List.of("daus","dayat","gea","debi","dani");

        // for loop
        for (var val : list){
            System.out.println(val);
        }

        // foreach anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // lamda
        list.forEach(s -> System.out.println(s));

        // lambda methode reference
        list.forEach(System.out::println);

    }
}
