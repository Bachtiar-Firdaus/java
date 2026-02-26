package lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    static void main(String[] args) {

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Bachtiar Firdaus";
            }
        };

        Supplier<String> supplier2 = () -> "Bachtiar Firdaus";

        System.out.println(supplier.get());
        System.out.println(supplier2.get());


    }
}
