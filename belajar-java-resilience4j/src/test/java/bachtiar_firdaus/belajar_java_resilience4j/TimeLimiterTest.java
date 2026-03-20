package bachtiar_firdaus.belajar_java_resilience4j;

import io.github.resilience4j.timelimiter.TimeLimiter;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import io.github.resilience4j.timelimiter.TimeLimiterRegistry;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
public class TimeLimiterTest {

    @SneakyThrows
    public String slow(){
        log.info("Slow");
        Thread.sleep(5000L);
        return "Eko";
    }

    @Test
    void timeLimiter() throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> slow());

        TimeLimiter timeLimiter = TimeLimiter.ofDefaults("pzn");
        Callable<String> callable = TimeLimiter.decorateFutureSupplier(timeLimiter, () -> future);

        callable.call();
    }


}
