package classes;

import java.util.Arrays;

public class ArraysApp {
    static void main(String[] args) {
        int[] numbers = {
                1,4,2,12,324,45,12
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 12));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1000));

        int[] result = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(result));

        int[] resultRanger = Arrays.copyOfRange(numbers, 2, 5);
        System.out.println(Arrays.toString(resultRanger));
    }
}
