package belajar_java_stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    // limit data
    @Test
    void testLimit(){
        List.of("daus","ega","ali","martin","candra").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    // skip data
    @Test
    void testSkip(){
        List.of("daus","ega","ali","martin","candra").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    // ambil selama kondisi terpenuhi dan
    // hentikan ketika ada yang tidak sesuai
    // meskipun selanjutnya ada yang sesuai tetep di stop
    @Test
    void testTakeWhile(){
        List.of("daus","ega","laras","ali","martin","candra").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    // ini kebalikannya
    @Test
    void testDropWhile(){
        List.of("daus","ega","laras","ali","martin","candra").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny(){
        Optional<String> optional = List.of("daus","ega","laras","ali","martin","candra").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testfindFirst(){
        Optional<String> optional = List.of("daus","ega","laras","ali","martin","candra").stream()
                .findFirst();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }


}
