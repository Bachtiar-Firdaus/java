public class TipeDataBukanPrimitif {
    static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte;
        iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        // konversi dari primitif ke bukan primitif
        int iniInt = 100;
        Integer iniInteger2 = iniInt;
        // konversi dari bukan promitif ke primitif
        int ageAgain = iniInteger2;
        short shortAge = iniInteger2.shortValue();
        long longAge = iniInteger2.longValue();
        byte byteAge = iniInteger2.byteValue();
    }
}
