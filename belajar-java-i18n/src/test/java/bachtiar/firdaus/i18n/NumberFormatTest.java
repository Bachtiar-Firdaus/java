package bachtiar.firdaus.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    @Test
    void testNumberFormat(){
        var numberFormat = NumberFormat.getNumberInstance();
        var format = numberFormat.format(1000000000.255);
        System.out.println(format);
    }
    @Test
    void testNumberFormatIndonesia(){
        var indonesia = new Locale("id","ID");
        var numberFormat = NumberFormat.getInstance(indonesia);
        var format = numberFormat.format(1000000000.255);
        System.out.println(format);
    }
    @Test
    void testNumberFormatParseIndonesia(){
        var indonesia = new Locale("id","ID");
        var numberFormat = NumberFormat.getInstance(indonesia);

        double format = 0;
        try {
            format = numberFormat.parse("1.000.000.000,255").doubleValue();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(format);
    }

}
