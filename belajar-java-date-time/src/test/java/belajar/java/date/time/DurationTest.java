package belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {

    @Test
    void create(){

        Duration duration = Duration.ofHours(10);
        Duration duration1 = Duration.ofMinutes(10);
        Duration duration2 = Duration.ofMillis(10);

        System.out.println(duration);
        System.out.println(duration1);
        System.out.println(duration2);


    }

    @Test
    void get(){
        Duration duration = Duration.ofHours(50);

        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toNanos());

    }

    @Test
    void between(){
        Duration duration = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(10));
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());

        Duration duration2 = Duration.between( LocalDateTime.now().plusHours(10),LocalDateTime.now());
        System.out.println(duration2.toHours());
        System.out.println(duration2.toMinutes());
    }
}
