package lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {
    static void main(String[] args) {

        // menggunakan interface dari util consumer
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        // consumernya di tandem dengan lambda
        Consumer<String> consumer1 = s -> System.out.println(s);

        consumer.accept("Bachtiar Firdaus");
        consumer1.accept("Bachtiar Firdaus");



    }



}
