package belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    @Test
    void create() {
        Calendar calender = Calendar.getInstance();
        Date date = calender.getTime();

        System.out.println(calender);
        System.out.println(date);

    }
    @Test
    void modifyCalender() {
        Calendar calender = Calendar.getInstance();

        calender.set(Calendar.YEAR, 2000);
        calender.set(Calendar.MONTH, Calendar.MARCH);
        calender.set(Calendar.DAY_OF_WEEK, 2);
        calender.set(Calendar.HOUR_OF_DAY, 2);
        calender.set(Calendar.MINUTE, 2);
        calender.set(Calendar.SECOND, 2);
        calender.set(Calendar.MILLISECOND, 2);

        Date date = calender.getTime();

        System.out.println(calender);
        System.out.println(date);

    }
    @Test
    void getCalender() {
        Calendar calender = Calendar.getInstance();

        System.out.println(calender.get(Calendar.YEAR));
        System.out.println(calender.get(Calendar.MONTH));
        System.out.println(calender.get(Calendar.DAY_OF_WEEK));
        System.out.println(calender.get(Calendar.HOUR_OF_DAY));
        System.out.println(calender.get(Calendar.MINUTE));
        System.out.println(calender.get(Calendar.SECOND));
        System.out.println(calender.get(Calendar.MILLISECOND));

    }
}
