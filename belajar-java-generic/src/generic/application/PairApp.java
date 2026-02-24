package generic.application;

import generic.Pair;

public class PairApp {
    static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<String, Integer>("daus",27);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }

}
