package collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("daus", "daus");
        map.put("budi", "budi");
        map.put("joko", "joko");

        for (var key : map.keySet()){
            System.out.println(key);
        }

        System.out.println(map.lowerKey("daus"));
        System.out.println(map.higherKey("daus"));
        System.out.println(map.ceilingKey("a"));
        System.out.println(map.floorKey("z"));

        NavigableMap<String, String> mapDesc = map.descendingMap();

        for (var key : mapDesc.keySet()){
            System.out.println(key);
        }

        // immutable
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        // immutable.put("joko", "joko"); Error


    }
}
