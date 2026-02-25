package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeekHashMapApp {
    static void main(String[] args) {

        // ini untuk data yang tidak di gunakan akan di delete
//        Map<Integer, Integer> map = new WeakHashMap<>();
        // ini lebih consisten pada data
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 1_000_000; i++) {
            map.put(i,i);
        }

        // untuk memaksa menjalankan garbage collection
        System.gc();

        System.out.println(map.size());

    }
}
