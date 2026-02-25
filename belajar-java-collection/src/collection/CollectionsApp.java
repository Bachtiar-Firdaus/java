package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("daus","abdi","dede","eka","ega","lia"));

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

    }
}
