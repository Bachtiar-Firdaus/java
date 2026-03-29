package bachtiar_firdaus.belajar_java_sequenced_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
import java.util.TreeMap;

public class MapTest {

    @Test
    void map() {
        SequencedMap<String, String> map = new TreeMap<>();
        map.put("c", "Daus");
        map.put("b", "Bachtiar");
        map.put("a", "Firdaus");

        Assertions.assertEquals("Firdaus", map.firstEntry().getValue());
        Assertions.assertEquals("Daus", map.lastEntry().getValue());

        SequencedMap<String, String> reversed = map.reversed();
        Assertions.assertEquals("Firdaus", reversed.lastEntry().getValue());
        Assertions.assertEquals("Daus", reversed.firstEntry().getValue());
    }

    @Test
    void linkedMap() {
        SequencedMap<String, String> map = new LinkedHashMap<>();
        map.putFirst("a", "Daus"); // a
        map.putFirst("b", "Bachtiar"); // b, a
        map.putFirst("c", "Firdaus"); // c, b, a

        Assertions.assertEquals("Firdaus", map.firstEntry().getValue());
        Assertions.assertEquals("Daus", map.lastEntry().getValue());
    }
}
