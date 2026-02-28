package belajar_java_stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void testStreamOperation(){
        List<String> names = List.of("bach","tiar","fir","daus");

        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(name->name.toUpperCase());

        streamUpper.forEach(System.out::println);
        names.forEach(System.out::println);


    }
}
