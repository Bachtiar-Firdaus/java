package belajar_java_stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {

    @Test
    void testMax(){
        List.of("daus","ega","laras","ali","martin","candra").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);


    }
    @Test
    void testMin(){
        List.of("daus","ega","laras","ali","martin","candra").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);


    }
    @Test
    void testCount(){
        long count = List.of("daus","ega","laras","ali","martin","candra").stream()
                .count();

        System.out.println(count);

    }

    @Test
    void testSum(){
        var result = List.of(1,2,3,4,5,6,7).stream()
                .reduce(0,(value, item)-> value + item);

        System.out.println(result);

    }
    @Test
    void testFactorial(){
        var result = List.of(1,2,3,4,5,6,7).stream()
                .reduce(1,(value, item)-> value * item);

        System.out.println(result);

    }

}
