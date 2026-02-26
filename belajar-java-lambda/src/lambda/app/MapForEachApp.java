package lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("1.", "daus");
        map.put("2.", "ega");
        map.put("3.", "debi");

        // for loop
        for (var val : map.entrySet()){
            System.out.println(val.getKey() +" : "+ val.getValue());
        }

        // forEach anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s +" : "+ s2);
            }
        });

        // lambda
        map.forEach((s, s2) -> System.out.println(s +" : "+ s2));

    }
}
