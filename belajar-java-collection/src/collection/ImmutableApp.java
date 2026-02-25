package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    static void main(String[] args) {

        List<String> one = Collections.singletonList("satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Bachtiar");
        mutable.add("Firdaus");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> element = List.of("bacht","tiar","fir","daus");

    }
}
