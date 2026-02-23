package classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    static void main(String[] args) {

        String value = "Bachtiar Firdaus";
        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while(tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
