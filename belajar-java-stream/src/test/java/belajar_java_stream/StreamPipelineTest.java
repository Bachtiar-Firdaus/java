package belajar_java_stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreateStreamPipeline (){
        // ini jarang di gunakan
        List<String> list = List.of("bach","tiar","fir","daus");

        Stream<String> stream = list.stream();

        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());

        Stream<String> streamMr = streamUpper.map(upper -> "MR. " + upper);

        streamMr.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipelineOk(){
        List<String> list = List.of("bach","tiar","fir","daus");

        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "MR. " + upper)
                .forEach(System.out::println);


    }
}
