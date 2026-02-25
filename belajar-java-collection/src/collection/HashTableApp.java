package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("daus", "daus");
        map.put("eko", "eko");
        map.put("ade", "ade");

        for (var key : map.keySet()){
            System.out.println(key);
        }


    }
}
