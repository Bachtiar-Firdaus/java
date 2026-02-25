package collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("bachtiar");
        list.add("firdaus");

        for(var val : list){
            System.out.println(val);
        }



    }
}
