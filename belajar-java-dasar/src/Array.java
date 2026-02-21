public class Array {
    static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "bachtiar";
        stringArray[1] = "firdaus";
        stringArray[2] = "daus";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "bach";
        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3]; // alternatif

        // array initializer
        int[] arrayInt = new int[]{
                10, 90, 80, 67, 29
        };

        String[] arrayName = {
                "bachtiar", "firdaus", "daus"
        };

        long[] arrayLong = {
                10, 90, 80, 67, 29
        };

        System.out.println(arrayLong.length);
        System.out.println(arrayName[1]);
        System.out.println(arrayInt[0]);


        // array di dalam array
        String[][] member = {
                {"daus", "dayar", "wili"},
                {"ega", "eka"},
                {"joko", "mile"}
        };

        String[] member1 = member[0];
        System.out.println(member1[0]);

        System.out.println(member[1][0]);
        System.out.println(member[2][0]);

    }
}
