public class KonversiNumber {
    static void main(String[] args) {

        // konversi dari kecil ke besar bisa otomatis
        // tapi klo dari besar ke ke kecil manual

        byte iniByteSample = 10;
        short iniShortSample = iniByteSample;
        int iniIntSample = iniShortSample;
        long iniLongSample = iniIntSample;
        float iniFloatSample = iniLongSample;
        double iniDoubleSample = iniFloatSample;


        // ketika konversi dari besar ke kecil hati hati number overflow
        float iniFloat2 = (float) iniDoubleSample;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;


    }
}
