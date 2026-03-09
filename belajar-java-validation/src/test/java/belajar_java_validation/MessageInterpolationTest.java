package belajar_java_validation;

import belajar_java_validation.group.VirtualAccountPaymentGroup;
import org.junit.jupiter.api.Test;

public class MessageInterpolationTest extends AbstractValidatorTest{

    @Test
    void testMessage() {

        Payment payment = new Payment();
        payment.setOrderId("10238138193810312938");
        payment.setVirtualAccount("312313");
        payment.setAmount(10L);

        validateWithGroups(payment, VirtualAccountPaymentGroup.class);

    }
}