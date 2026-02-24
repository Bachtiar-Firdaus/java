package classes;

public class NumberApp {
    static void main(String[] args) {

        Integer intValue = 10;
        Long longValue = intValue.longValue();
        Double dobleValue = longValue.doubleValue();
        Short shortValue = dobleValue.shortValue();

        System.out.println(shortValue);

        String contoh = "1000";
        // klo primitif
        int contohPrimitif = Integer.parseInt(contoh);
        // object
        Integer contohObject = Integer.valueOf(contoh);

        System.out.println(contohPrimitif);
        System.out.println(contohObject);

    }
}
