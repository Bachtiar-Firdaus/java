package belajar_java_stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {

    @Test
    void testPeekBefore(){
        List.of("daus","ega","laras","ali","martin","candra").stream()
                .map(name ->{
                    System.out.println("Change Name to upper : " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Change Name to upper : " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("Final Name : " + name));
    }
    @Test
    void testPeekAfter(){
        List.of("daus","ega","laras","ali","martin","candra").stream()
                .peek(name -> System.out.println("Change Name to upper : " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("Change Name to upper : " + upper))
                .forEach(name -> System.out.println("Final Name : " + name));
    }
}
