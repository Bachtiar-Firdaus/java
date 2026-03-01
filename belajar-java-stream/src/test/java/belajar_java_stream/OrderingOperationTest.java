package belajar_java_stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

    @Test
    void testSorted() {
        List.of("daus","ega","laras","ali","martin","candra").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("daus","ega","laras","ali","martin","candra").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}
