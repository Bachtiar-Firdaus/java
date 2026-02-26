package lambda.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    static void main(String[] args) {

        sayHello("bachtiar");

        // karna menggunakan lambda ini di skip
        String name = null;

        sayHello(name);

    }

    public static void sayHello(String name){
//        // ini lambda dengan methode reference
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        value -> System.out.println("Hello "+ value),
//                        () -> System.out.println("Hello")
//                );

        // ini lambda dengan methode reference
        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("Teman");

        System.out.println("Hello "+upperName);

//        // ini lambda dengan methode reference
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresent(System.out::println);
//

        // ini dengan lambda
//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalUpper = optionalName.map(s -> s.toUpperCase());
//        optionalUpper.ifPresent(s -> System.out.println("Hello "+ s));

        // klo ga pake lambda ketika kete null error
        //        String nameUpper = name.toUpperCase();
//        System.out.println("Hello "+ nameUpper);
    }
}
