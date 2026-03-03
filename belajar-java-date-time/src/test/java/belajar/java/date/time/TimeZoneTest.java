package belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneTest {

    @Test
    void create(){
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone);

        TimeZone timeZoneGMT = TimeZone.getTimeZone("GMT");
        System.out.println(timeZoneGMT);

        String[] availableIds = TimeZone.getAvailableIDs();
        Arrays.asList(availableIds)
                .forEach(zoneId -> System.out.println(zoneId));

    }

    @Test
    void date(){
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.toGMTString());


    }

    @Test
    void calendar(){
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
        Calendar calendarGMT = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendarGMT.get(Calendar.HOUR_OF_DAY));


        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(calendarGMT.get(Calendar.HOUR_OF_DAY));

    }


}
