package belajar_java_validation;


import belajar_java_validation.group.CreditCardPaymentGroup;
import org.junit.jupiter.api.Test;

public class CustomConstraintTest extends AbstractValidatorTest{

    @Test
    void testCustomConstraint() {

        Payment payment = new Payment();
        payment.setOrderId("daus");

        validateWithGroups(payment, CreditCardPaymentGroup.class);

    }
}
