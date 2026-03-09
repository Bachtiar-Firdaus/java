package belajar_java_validation.constraint;


import belajar_java_validation.enums.CaseMode;
import belajar_java_validation.group.CreditCardPaymentGroup;
import belajar_java_validation.group.VirtualAccountPaymentGroup;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@CheckCase(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class},
        mode = CaseMode.UPPER, message = "{order.id.upper}")
@NotBlank(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class},
        message = "{order.id.notblank}")
@Size(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class},
        min = 1, max = 10, message = "{order.id.size}")
@Documented
@Constraint(validatedBy = {})
@Target({FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface CheckOrderId {

    String message() default "invalid order id";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}