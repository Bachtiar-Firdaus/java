package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name","Bachtiar");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Bachtiar");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Bachtiar",
                "middle", "Firdaus",
                "last", "Sulaiman"
        );

//        map.put("a","A"); error
    }
}
