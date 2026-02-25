package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("daus");

        Set<String> mutable = new HashSet<>();
        mutable.add("Bachtiar");
        mutable.add("Firdaus");
        Set<String> set = Set.of("daus","firdaus");

        // error
//        set.add("daus");
//        set.remove("daus");
    }
}
