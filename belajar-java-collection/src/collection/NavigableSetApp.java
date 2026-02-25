package collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("dek","dika","lia","leli"));

        // desc
        NavigableSet<String> namesReverse = names.descendingSet();

//        NavigableSet<String> dika = names.headSet("dika",true);
        NavigableSet<String> dika = names.tailSet("dika",true);


        for(var val : dika){
            System.out.println(val);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // ini sudah tidak bisa karna sudah di konversi
        //        immutable.add("ups");



    }
}
