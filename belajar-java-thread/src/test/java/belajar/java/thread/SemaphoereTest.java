package belajar.java.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoereTest {
    @Test
    void test() throws InterruptedException {

        final var semaphore = new Semaphore(5);
        final var executor = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executor.execute(() -> {
                try {
                    semaphore.acquire();
                    Thread.sleep(1000);
                    System.out.println("Finish"+ finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            });
        }

        executor.awaitTermination(1, TimeUnit.DAYS);

    }
}
