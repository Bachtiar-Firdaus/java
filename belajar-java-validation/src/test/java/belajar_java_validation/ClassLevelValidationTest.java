package belajar_java_validation;


import org.junit.jupiter.api.Test;

public class ClassLevelValidationTest extends AbstractValidatorTest{

    @Test
    void testClassLevel() {

        Register register = new Register();
        register.setUsername("daus");
        register.setPassword("rahasia123");
        register.setRetypePassword("rahasia123");

        validate(register);

    }
}