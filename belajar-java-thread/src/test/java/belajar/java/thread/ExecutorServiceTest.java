package belajar.java.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest {

    @Test
    void testExecuteService() throws InterruptedException {
        var executor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 100; i++) {
            executor.execute(()->{
                try {
                    Thread.sleep(1000);
                    System.out.println("Runnable in thread : " + Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            });

        }
        executor.awaitTermination(1, TimeUnit.DAYS);
    }
    @Test
    void testExecuteServiceFix() throws InterruptedException {
        var executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            executor.execute(()->{
                try {
                    Thread.sleep(1000);
                    System.out.println("Runnable in thread : " + Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            });

        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }

}
