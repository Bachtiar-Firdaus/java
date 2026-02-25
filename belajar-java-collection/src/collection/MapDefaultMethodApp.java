package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("daus","daus val");
        map.put("ega","ega val");
        map.put("firdaus","firdaus val");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });



    }
}
