package belajar_java_stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream(){

        Stream<String> emptyStram = Stream.empty();
        emptyStram.forEach(a -> {
            System.out.println(a);
        });

        Stream<String> oneStream = Stream.of("Daus");
        oneStream.forEach(System.out::println);

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(System.out::println);

    }

    @Test
    void testCreateStreamFromArray(){

        Stream<String> arrayStream = Stream.of("bachtiar","firdaus","belajar");
        arrayStream.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8);
        integerStream.forEach(System.out::println);

        String[] array = new String[]{
                "bach","tiar","fir","daus"
        };
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);


    }

    @Test
    void testCreateStreamFromCollection(){
        Collection<String> collection = List.of("bach","tiar","fir","daus");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);

        Stream<String> stringStream2 = collection.stream();
        stringStream2.forEach(System.out::println);


    }


    @Test
    void testCreateInfiniteStream(){
        Stream<String> stream = Stream.generate(()-> "Bachtiar Firdaus");
//        stream.forEach(System.out::println);
        Stream<Integer> iterate = Stream.iterate(1,value -> value+1);
//        iterate.forEach(System.out::println);
    }

}
