package bachtiar_firdaus.belajar_java_sequenced_collection;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class CollectionTest {

    @Test
    void collection() {
        SequencedCollection<String> list = new ArrayList<>();
        list.addLast("Bachtiar"); // Bachtiar
        list.addFirst("Firdaus"); // Firdaus, Bachtiar
        list.addFirst("Daus"); // daus, Firdaus, Bachtiar

        Assertions.assertEquals(List.of("Daus", "Firdaus", "Bachtiar"), list);

        Assertions.assertEquals("Daus", list.getFirst());
        Assertions.assertEquals("Bachtiar", list.getLast());

        SequencedCollection<String> reversed = list.reversed();
        Assertions.assertEquals(List.of("Bachtiar", "Firdaus", "Daus"), reversed);

        String value = list.removeFirst();
        Assertions.assertEquals("Daus", value);
        Assertions.assertEquals("Firdaus", list.getFirst());

        value = list.removeLast();
        Assertions.assertEquals("Bachtiar", value);
        Assertions.assertEquals("Firdaus", list.getLast());
    }
}
