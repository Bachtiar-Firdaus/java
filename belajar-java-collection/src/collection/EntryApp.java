package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("daus","daus value");
        map.put("eko","eko value");
        map.put("ade","ade value");

        Set<Map.Entry<String,String>> entries = map.entrySet();

        for(var entrie : entries){
            System.out.println(entrie.getKey() + " : " + entrie.getValue());
        }
    }
}
