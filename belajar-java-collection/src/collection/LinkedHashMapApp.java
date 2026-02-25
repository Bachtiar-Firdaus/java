package collection;

import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "bachtiar");
        map.put("midle", "dev");
        map.put("last", "firdaus");

        Set<String> keys = map.keySet();
        for(var key : keys){
            System.out.println(key);
        }

    }
}
