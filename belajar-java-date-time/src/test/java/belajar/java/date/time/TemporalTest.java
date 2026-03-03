package belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TemporalTest {

    @Test
    void temporal(){
        Temporal temporal = LocalDate.now();
        Temporal temporal1 = LocalTime.now();
        Temporal temporal2 = ZonedDateTime.now();
        Temporal temporal3 = Year.now();

    }

    @Test
    void temporalAmmount(){
        Temporal temporal = LocalDateTime.now();
        Temporal temporal1 = temporal.plus(Duration.ofHours(10));
        Temporal temporal2 = temporal.plus(Period.ofDays(10));

        System.out.println(temporal);
        System.out.println(temporal1);
        System.out.println(temporal2);

    }

    @Test
    void temporalUnit(){
        long temporalUnit1 = ChronoUnit.DAYS.between(LocalDateTime.now(),LocalDateTime.now().plusHours(10));
        System.out.println(temporalUnit1);

    }

    @Test
    void temporalFields(){

        Temporal temporal = LocalDateTime.now();

        System.out.println(temporal.get(ChronoField.YEAR));
        System.out.println(temporal.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(temporal.get(ChronoField.DAY_OF_MONTH));
        System.out.println(temporal.get(ChronoField.HOUR_OF_DAY));
        System.out.println(temporal.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(temporal.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println(temporal.get(ChronoField.MILLI_OF_SECOND));
        System.out.println(temporal.get(ChronoField.NANO_OF_SECOND));

    }

    @Test
    void temporalQuery(){
        Temporal temporal = LocalDateTime.now();
        List<Integer> integers = temporal.query((TemporalQuery<List<Integer>>) temporal1 -> {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(temporal1.get(ChronoField.YEAR));
            list.add(temporal1.get(ChronoField.MONTH_OF_YEAR));
            list.add(temporal1.get(ChronoField.DAY_OF_MONTH));

            return list;
        });

        System.out.println(integers);


    }


    @Test
    void temporalAdjuster() {
        Temporal temporal1 = LocalDate.now();
        System.out.println(temporal1);
        Temporal temporal2 = temporal1.with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal temporal) {
                return LocalDate.of(
                        temporal.get(ChronoField.YEAR),
                        temporal.get(ChronoField.MONTH_OF_YEAR),
                        1

                );
            }
        });
        System.out.println(temporal2);
        Temporal temporal3 = temporal1.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(temporal3);
        Temporal temporal4 = temporal1.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(temporal4);
    }
}
