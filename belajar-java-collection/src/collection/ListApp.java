package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    static void main(String[] args) {

        // array list
//        List<String> String = new ArrayList<>();

        // linked list
        List<String> String = new LinkedList<>();

        String.add("daus");
        String.add("firda");

        String.set(0,"diki");

        String.remove(1);
        System.out.println(String.get(0));

        for (var val : String){
            System.out.println(val);
        }

    }
}
