package bachtiar_firdaus.belajar_java_resilience4j;

import io.github.resilience4j.bulkhead.*;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;

@Slf4j
public class BulkheadTest {

    private AtomicLong counter = new AtomicLong(0L);

    @SneakyThrows
    public void slow() {
        long value = counter.incrementAndGet();
        log.info("Slow : " + value);
        Thread.sleep(1_000L);
    }

    @Test
    void testSemaphore() throws InterruptedException {
        Bulkhead bulkhead = Bulkhead.ofDefaults("pzn");

        for (int i = 0; i < 1000; i++) {
            Runnable runnable = Bulkhead.decorateRunnable(bulkhead, () -> slow());
            new Thread(runnable).start();
        }

        Thread.sleep(10_000L);
    }

    @Test
    void testThreadPool() {

        log.info(String.valueOf(Runtime.getRuntime().availableProcessors()));

        ThreadPoolBulkhead bulkhead = ThreadPoolBulkhead.ofDefaults("pzn");

        for (int i = 0; i < 20; i++) {
            Supplier<CompletionStage<Void>> supplier = ThreadPoolBulkhead.decorateRunnable(bulkhead, () -> slow());
            supplier.get();
        }
    }

}