package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {

    static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(List.of("daus","dayat","ega","debi","alif"));

        Collections.sort(list);

        for (var val : list){
            System.out.println(val);
        }

        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(list,reverse);


        for (var val : list){
            System.out.println(val);
        }

    }
}
