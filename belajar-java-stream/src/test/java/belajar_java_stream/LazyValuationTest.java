package belajar_java_stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyValuationTest {

    @Test
    void testIntermediateOperation(){
        List<String> list = List.of("bach","tiar","fir","daus");

        Stream<String> upper = list.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                });



    }

    @Test
    void testTerminalOperation(){
        List<String> list = List.of("bach","tiar","fir","daus");

        list.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Change " + upper + " to mr.");
                    return "mr. "+upper;
                })
                .forEach(System.out::println);



    }
}
