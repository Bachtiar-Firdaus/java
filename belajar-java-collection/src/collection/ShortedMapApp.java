package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class ShortedMapApp {
    static void main(String[] args) {

        // ini untuk comparator desc
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };


        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("daus", "daus");
        sortedMap.put("kali", "kali");
        sortedMap.put("rafi", "rafi");

        for (var val : sortedMap.keySet()){
            System.out.println(val);
        }

        // immutable
        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

        // testing ubah pasti error
//        immutable.put("testing","testing");
    }
}
