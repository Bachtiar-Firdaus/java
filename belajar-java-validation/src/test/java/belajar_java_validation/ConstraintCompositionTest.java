package belajar_java_validation;

import belajar_java_validation.group.CreditCardPaymentGroup;
import org.junit.jupiter.api.Test;

public class ConstraintCompositionTest extends AbstractValidatorTest{

    @Test
    void testComposition() {

        Payment payment = new Payment();
        payment.setOrderId("29852309850238529589akjkjdsak");

        validateWithGroups(payment, CreditCardPaymentGroup.class);

    }
}