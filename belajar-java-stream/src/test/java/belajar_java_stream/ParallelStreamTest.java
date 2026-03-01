package belajar_java_stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class ParallelStreamTest {

    @Test
    void testSquential() {
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .forEach(System.out::println);
    }

    @Test
    void testParallel() {
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .parallel()
                .forEach(number -> {
                    System.out.println(Thread.currentThread().getName() + " : " + number);
                });
    }
}
