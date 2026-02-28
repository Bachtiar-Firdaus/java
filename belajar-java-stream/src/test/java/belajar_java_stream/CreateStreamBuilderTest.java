package belajar_java_stream;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.stream.Stream;

public class CreateStreamBuilderTest {
    @Test
    void testCreateStreamBuilder(){

        Stream.Builder<String> builder = Stream.builder();
        builder.accept("daus");
        builder.add("Bachtiar").add("firdaus");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);

    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<String> stream = Stream.<String>builder()
                .add("bach").add("tiar").build();
        stream.forEach(System.out::println);
    }

}
