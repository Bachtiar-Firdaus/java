package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        // menambahkan data
        collection.add("daus");
        collection.add("eko");
        collection.add("firdaus");
        collection.addAll(List.of("belajar","java","spring"));

        for(var val : collection){
            System.out.println(val);
        }

        // menghapus data
        System.out.println("Remove");
        collection.remove("eko");
        collection.removeAll(List.of("daus","spring"));
        for(var val : collection){
            System.out.println(val);
        }

        // ini untuk mencari data
        System.out.println(
                collection.contains("bachtiar")
        );
        System.out.println(
                collection.containsAll(List.of("firdaus","java"))
        );

        System.out.println(collection.size());
    }
}
