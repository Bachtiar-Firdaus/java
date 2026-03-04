package belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest {

    @Test
    void parsing(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2020 10 25", formatter);
        System.out.println(localDate);


    }
    @Test
    void format(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2020 10 25", formatter);

        String format = localDate.format(formatter);

        System.out.println(format);


    }
    @Test
    void defaultFormatter(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2020 10 25", formatter);

        String format = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(format);


    }
    @Test
    void defaultFormatteri18n(){

        Locale locale = new Locale("id","ID");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate localDate = LocalDate.now();

        String format = localDate.format(formatter);

        System.out.println(format);


    }

}
