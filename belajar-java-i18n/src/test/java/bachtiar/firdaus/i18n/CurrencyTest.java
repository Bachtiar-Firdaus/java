package bachtiar.firdaus.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {

    @Test
    void testCurrencyIndonesia(){
        var indonesia = new Locale("id","ID");
        var currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(indonesia));
    }
    @Test
    void testCurrencyUSA(){
        var usa = new Locale("en","US");
        var currency = Currency.getInstance(usa);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(usa));
    }

    @Test
    void testNumberFormatCurrencyIndonesia() {
        var indonesia = new Locale("id", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        var format = numberFormat.format(1000000);
        System.out.println(format);
    }
    @Test
    void testNumberFormatCurrencyParseIndonesia() {
        var indonesia = new Locale("id", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        try{
            var parse = numberFormat.parse("Rp900.000,21").doubleValue();
            System.out.println(parse);

        }catch (ParseException e){
            System.out.println("Error parse : " + e.getMessage());
        }
    }
}
