package classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    static void main(String[] args) {
        String name = "Bachtiar Firdaus Belajar Java, diki nonton";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);

        while (matcher.find()){
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
