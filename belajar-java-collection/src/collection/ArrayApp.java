package collection;

import java.util.Arrays;
import java.util.List;

public class ArrayApp {
    static void main() {
        List<String> names = List.of("bachtiar","fir","daus");

        Object[] objects = names.toArray();
        String[] strings = names.toArray(names.toArray(new String[]{}));

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));



    }
}
