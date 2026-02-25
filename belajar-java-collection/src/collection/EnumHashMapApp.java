package collection;

import java.util.EnumMap;
import java.util.Map;
import java.util.logging.Level;

public class EnumHashMapApp {

    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }


    static void main(String[] args) {

        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "daus");
        map.put(Level.VIP, "Bachtiar");

        for (var key : map.keySet()){
            System.out.println(map.get(key));
        }


    }
}
