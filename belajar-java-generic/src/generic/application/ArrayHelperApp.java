package generic.application;

import generic.util.ArrayHelper;

public class ArrayHelperApp {
    static void main(String[] args) {

        String[] names = {"daus", "dayat", "debi", "martin"};
        Integer[] numbers = {1,4,2,3,435,12};


        //ada 2 opsi type di definisikan atau tidak di definisikan

        // sample type di definisikan sesuai value
        System.out.println(
                ArrayHelper.<String>count(names)
        );

        // sample type tidak di definisikan
        System.out.println(
                ArrayHelper.count(numbers)
        );

    }
}
