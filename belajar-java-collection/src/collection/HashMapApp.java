package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("name.first","Bachtiar");
        map.put("name.last","Firdaus");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.last"));
    }
}
