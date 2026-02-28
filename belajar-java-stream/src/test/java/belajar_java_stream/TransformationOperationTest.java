package belajar_java_stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void testMap(){
        List<String> list = List.of("bach","tiar","fir","daus");

        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(System.out::println);


    }


    @Test
    void testFlatMap(){
        List<String> list = List.of("bach","tiar","fir","daus");

        list.stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .flatMap(upper -> Stream.of(upper, upper, upper))
                .forEach(System.out::println);


    }

}
