package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    static void main(String[] args) {

        // berurutan
        Set<String> names = new LinkedHashSet<>();
        // tidak berurutan
//        Set<String> names = new HashSet<>();

        names.add("diki");
        names.add("irfan");
        names.add("luthfi");
        names.add("diki");
        names.add("irfan");
        names.add("luthfi");

        for(var val : names){
            System.out.println(val);
        }

    }
}
