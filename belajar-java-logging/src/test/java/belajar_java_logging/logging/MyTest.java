package belajar_java_logging.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

public class MyTest {

    @Test
    void testRequestId() throws InterruptedException {

//        String requestId = UUID.randomUUID().toString();
        MyController controller = new MyController(new MyService(new MyRepository()));
//        MDC.put("requestId",requestId);
//        controller.save();
//        MDC.remove("requestId");

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                String requestId = UUID.randomUUID().toString();
                MDC.put("requestId", requestId);
                controller.save();
                MDC.remove("requestId");
            }).start();
        }

        Thread.sleep(1000L);

    }
}