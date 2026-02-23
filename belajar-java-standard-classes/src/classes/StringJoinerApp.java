package classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",","[","]");

        joiner.add("bachtiar");
        joiner.add("firdaus");

        String value = joiner.toString();
        System.out.println(value);

    }
}
